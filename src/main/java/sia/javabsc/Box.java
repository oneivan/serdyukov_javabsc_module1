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
    final String size; // M S L XL XXL...
    String color; // Red,Green,Black ...
    boolean empty;

    public void actReport( String msg ) {
        System.out.println("BOX REPORT: " + msg );
    }
    String isEmptyMsg() { return (this.empty ? "пусто" : "заполнена"); }
    boolean isEmpty() { return this.empty ; }
    boolean putIn() { String msg = (this.empty ? "положили" : "не положили"); actReport(msg); this.empty = true; return this.empty ; }
    boolean getOut() { String msg = (this.empty ? "нет вещей" : "выложили"); this.empty=true; actReport(msg); return this.empty ; }
    void setCollor( String clr ) { String msg = "перекрасили в " + clr;  this.color = clr ; }
    String getCollor() { String msg = "текущий цвет " + this.color; return this.color; }

    public Box(String size , String clr ) {
        actReport("новый коробас");
        this.size = size;
        this.color = clr;
        this.empty = false;
    }

    public void showInfo() {
        actReport("Коробка цвета " + color + "\nРазмер - " + size + "\nзаполнена? " + isEmptyMsg());
    }
}
