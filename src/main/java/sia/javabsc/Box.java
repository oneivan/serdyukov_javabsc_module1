package sia.javabsc;

/*
Попробуйте реализовать класс по его описания:
    объекты класса Коробка должны иметь размеры и цвет.
    Коробку можно открывать и закрывать.
    Коробку можно перекрашивать.
    Изменить размер коробки после создания нельзя.
    У коробки должен быть метод, печатающий информацию о ней в консоль.
    В коробку можно складывать предмет (если в ней нет предмета),
    или выкидывать его оттуда (только если предмет в ней есть),
    только при условии что коробка открыта (предметом читаем просто строку).
    Выполнение методов должно сопровождаться выводом сообщений в консоль.
*/
public class Box {
    private final String size; // M S L XL XXL...
    private String color; // Red,Green,Black ...
    private boolean empty;

    private void actReport(String msg) {
        System.out.println("BOX REPORT: " + msg);
    }

    String isEmptyMsg() {
        return (this.empty ? "пусто" : "заполнена");
    }

    boolean isEmpty() {
        return this.empty;
    }

    boolean putIn() {
        String msg = (this.empty ?  "положили" : "не положили" );
        actReport(msg);
        this.empty = false;
        return this.empty;
    }

    boolean getOut() {
        String msg = (this.empty ? "нет вещей" : "выложили");
        this.empty = true;
        actReport(msg);
        return this.empty;
    }

    void setCollor(String clr) {
        actReport( "перекрасили в " + clr );
        this.color = clr;
    }

    String getCollor() {
        actReport( "текущий цвет " + this.color );
        return this.color;
    }

    public Box(String size, String clr) {
        actReport("новый коробас");
        this.size = size;
        this.color = clr;
        this.empty = true;
    }

    public void showInfo() {
        actReport("INFO\n\tКоробка цвета " + color + "\n\tРазмер - " + size + "\n\tзаполнена? " + isEmptyMsg());
    }
}
