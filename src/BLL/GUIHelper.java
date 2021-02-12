package BLL;

import BE.Student;
import javafx.geometry.Pos;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

import java.io.File;

public class GUIHelper {

    /**
     * Create a BorderPane scene element for the given Student.
     *
     * @param student The student to create a BorderPane for.
     * @return Returns the created BorderPane. Null if the student is null.
     */
    public static BorderPane createStudentBorderPane(Student student) {
        if (student != null) {
            var pane = new BorderPane();

            // Get the student's first and last name as well as picture path.
            Text studentName = new Text(String.format("%s %s", student.getFirstName(), student.getLastName()));
            ImageView picture = new ImageView(new File(student.getPicture()).toURI().toString());

            // Adjust to fit the BorderPane.
            BorderPane.setAlignment(studentName, Pos.TOP_CENTER);
            BorderPane.setAlignment(picture, Pos.CENTER);

            // Add the elements (nodes) to the BorderPane.
            pane.setTop(studentName);
            pane.setCenter(picture);

            // Return the created BorderPane.
            return pane;
        }
        return null;
    }
}
