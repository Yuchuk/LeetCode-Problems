package prob2;

public class Transcript {
    List<TranscriptEntry> transcriptEntry = new ArrayList<>();
    public Transcript();

    public void addTranscriptEntry(LocalDate courseDate, String grade, Course course){
        transcriptEntry.add(new TranscriptEntry(courseDate, grade, course));
    }

    public List<TranscriptEntry> getTranscriptEntries(){
        return transcriptEntry;
    }

}
