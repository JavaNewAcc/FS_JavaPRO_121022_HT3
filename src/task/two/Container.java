package task.two;

import java.io.*;

@SaveTo(path="/Java/ProgAcademy_Fullstack_121022/FullStack_lessons/Java/Lesson_JavaPRO_3/SavedText.txt")
public class Container {
    private String text="This is a test text for task two of hometask three";

    @Saver
    public void saveData(String URL) throws IOException {
        File file=new File(URL);
        try (Writer writer=new FileWriter(file)){
            writer.write(text);
        }
        catch (IOException e){
            throw e;
        }
    }
}
