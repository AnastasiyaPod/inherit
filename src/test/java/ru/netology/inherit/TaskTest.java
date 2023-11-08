package ru.netology.inherit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class TaskTest {
    @Test
    public void simpleTaskMatchesTrue() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void simpleTaskMatchesFalse() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean actual = simpleTask.matches("Купить");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void epicMatchesTrue() {
        Epic epic = new Epic(55, new String[]{"молоко"});
        boolean actual = epic.matches("молоко");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void epicMatchesFalse() {
        Epic epic = new Epic(55, new String[]{"молоко"});
        boolean actual = epic.matches("хлеб");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingMatchesTopicTrue() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("приложения");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingMatchesProjectTrue() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("НетоБанка");
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void meetingMatchesFalse() {
        Meeting meeting = new Meeting(555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        boolean actual = meeting.matches("купить");
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}