package MostCommonWord;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
        public String mostCommonWord(String paragraph, String[] banned) {

            Map<String, Integer> uniqueStringMap = new HashMap<>();
            Set<String> bannedHashSet = new HashSet<String>();
            String temp = " ";
            int mostFrequent = 0;
            String[] splitedParagraph = paragraph.toLowerCase().split("\\W+");

            for(int m = 0; m < banned.length; m++){
                bannedHashSet.add(banned[m]);
            }

            for(int i = 0; i < splitedParagraph.length; i ++){
                temp = splitedParagraph[i];
                System.out.println("temp: "+ temp);
                int j = i;
                int counter = 0;

                if(!uniqueStringMap.containsKey(temp) && !bannedHashSet.contains(temp)){
                    while(j < splitedParagraph.length){
                        if(temp.equals(splitedParagraph[j])){
                            counter++;
                            j++;
                        } else {
                            j++;
                        }
                    }
                    uniqueStringMap.put(temp, counter);
                }
            }
            for (Map.Entry<String, Integer> entry : uniqueStringMap.entrySet()) {
                if(mostFrequent < entry.getValue()){
                    mostFrequent = entry.getValue();
                    temp = entry.getKey();
                }
            }
            return temp;
        }
    }

