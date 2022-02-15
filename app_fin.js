//дэлгэцтэй ажиллах conroller
var uiController = (function () {
    var DOMstrings = {
        inputType: ".add__type",
        inputDescription: ".add__description",
        inputValue: ".add__value",
        addBtn: ".add__btn",
        incomeList: ".income__list",
        expenseList: ".expenses__list",
        tusuvLabel: ".budget__value",
        incomeLabel: ".budget__income--value",
        expeseLabel: ".budget__expenses--value",
        percentageLabel: ".budget__expenses--percantage"
    }

    return {
        getInput: function () {
            return {
                type: document.querySelector(DOMstrings.inputType).value,
                description: document.querySelector(DOMstrings.inputDescription).value,
                //parseint function нь string-г number-т хөрвүүлнэ
                value: parseint(document.querySelector(DOMstrings.inputValue).value)
            };
        },
        getDOMstrings: function () {
            return DOMstrings;
        },
        clearFeilds: function () {
            var feilds = document.querySelectorAll(DOMstrings.inputDescription + "," + DOMstrings.inputValue);
            //convert list to array
            var fieldsArr = Array.prototype.slice.call(fields);
            fieldsArr.forEach(function (el, index, array) {
                el.value = "";
            });
            fieldsArr[0].focus();
        },
        tusviigUzuuleh: function (tusuv) {
            document.querySelector(DOMstrings.tusuvLabel).textContent = tusuv.tusuv;
            document.querySelector(DOMstrings.incomeLabel).textContent = tusuv.totalInc;
            document.querySelector(DOMstrings.expeseLabel).textContent = tusuv.totalExp;
            if (tusuv.huvi === "0") {
                document.querySelector(DOMstrings.percentageLabel).textContent = tusuv.huvi;
            } else {
                document.querySelector(DOMstrings.percentageLabel).textContent = tusuv.huvi + "%";
            }
        },
        addListItem = function (item, type) {
            // Орлого зарлагын элемент агуулсан html бэлтгэнэ
            var html, list;
            list = DOMstrings.incomeList;
            if (type === "inc") {
                html = '<div class="item clearfix" id="income-%id%"><div class="item__description">$$DESCRIPTION$$</div><div class="right clearfix"><div class="item__value">$$VALUE$$</div><div class="item__delete">            <button class="item__delete--btn"><i class="ion-ios-close-outline"></i></button></div>        </div></div>';
            } else {
                list = DOMstrings.expenseList;
                html = '<div class="item clearfix" id="expense-%id%"><div class="item__description">$$DESCRIPTION$$</div>          <div class="right clearfix"><div class="item__value">$$VALUE$$</div><div class="item__percentage">21%</div><div class="item__delete"><button class="item__delete--btn">                <i class="ion-ios-close-outline"></i></button></div></div></div>';
            }
            //html дотроо орлого зарлагаа replace ашиглаж өөрчилж өгнө
            html = html.replace("%id%", item.id);
            html = html.replace("$$DESCRIPTION$$", item.description);
            html = html.replace("$$VALUE$$", item.value);
            //Бэтгэсэн html - ээ DOM-д хийж өгнө
            document.querySelector(list).insertAdjacentHTML("beforeend", html);
        }
    };
})();
//санхүүтэй ажиллах conroller
var financeController = (function () {
    var Income = function (id, description, value) {
        this.id = id;
        this.description = description;
        this.value = value;
    };
    var Expense = function (id, description, value) {
        this.id = id;
        this.description = description;
        this.value = value;
    };
    var calculateTotal = function (type) {
        var sum = 0;
        data.items[type].forEach(function (el) {
            sum = sum + el.value;
        });
        data.totals[type] = sum;
    },
    var data = {
        items: {
            inc: [],
            exp: []
        },
        totals: {
            inc: 0,
            exp: 0
        },
        tusuv: 0,
        huvi: 0
    };
    return {
        tusuvTootsooloh: function () {
            calculateTotal("inc");
            calculateTotal("exp");
            //Төсвийг шинээр тооцоолно
            data.tusuv = data.totals.inc - data.totals.exp;
            // Орлого зарлага хувь тооцоолно
            data.huvi = Math.round((data.totals.exp / data.totals.inc) * 100);
        },
        tusviigAvah: function () {
            return {
                tusuv: data.tusuv,
                huvi: data.huvi,
                totalInc: data.totals.inc,
                totalExp: data.totals.exp
            }
        },
        addItem: function (type, desc, val) {
            var item, id;
            if (data.items[type].length === 0) id = 1;
            else {
                id = data.items[type][data.items[type].length - 1].id + 1;
            }
            if (type === "inc") {
                item = new Income(id, desc, val);
            } else {
                item = new Expense(id, desc, val);
            }
            data.items[type].push(item);
            return item;
        }
    }
})();
//програмын холбогч conroller
var appController = (function (uiController, financeController) {
    var ctrlAddItem = function () {
        //1. оруулах өгөгдөлийг дэлгэцнээс олж авна
        var input = uiController.getInput();
        if (inpit.description !== "" && input.value !== ""); {
            //2. Олж авсан өгөгдлүүдээ санхүүгийн контролорт дамжуулж хадгална
            var item = financeController.addItem(input.type, input.description, input.value);
            //3. Олж авсан өгөгдөлөө вэб дээр харуулна
            uiController.addListItem(item, input.type);
            uiController.clearFeilds();
            //4. Төсөв тооцоолно
            financeController.tusuvTootsooloh();
            //5. Эцсийн үлдэгдэл тооцоог дэлгэцэнд гаргана
            var tusuv = financeController.tusviigAvah();
            // 6. Төсвийн тооцоог дэлгэцэнд гаргана
            uiController.tusviigUzuuleh(tusuv);
        }
    };
    var setupEventListeners = function () {
        var DOM = uiController.getDOMstrings();
        document.querySelector(DOM.addBtn).addEventListener("click", function () {
            ctrlAddItem();
        });
        document.addEventListener("keypress", function (event) {
            if (event.keyCode === 13 || event.which === 13) {
                ctrlAddItem();
            }
        });
    };
    return {
        init: function () {
            console.log("Application started");
            uiController.tusviigUzuuleh({
                tusuv: 0,
                huvi: 0,
                totalInc: 0,
                totalExp: 0
            });
            setupEventListeners();
        }
    };
})(uiController, financeController);
appController.init();
