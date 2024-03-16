package sia.javabsc;

import java.io.*;
import java.util.*;

/*
Описание/Пошаговая инструкция выполнения домашнего задания:

Реализуйте приложение, позволяющее работать с текстовыми файлами
При старте приложения, в консоль выводится список текстовых файлов из корневого каталоге проекта
Далее программа запрашивает имя файла, с которым хочет работать пользователь
Содержимое файла выводится в консоль
Затем любую введенную пользователем строку необходимо записывать в указанный файл

*/
public class Main {
    public static void main(String[] args) {
        File crntDir = new File(".");
        System.out.println(Arrays.toString(crntDir.listFiles()) );
        List<String> txtForWork = new ArrayList<String>();
        for (File txtFile : Objects.requireNonNull(crntDir.listFiles())) {
            if (txtFile.isFile()) {
                String rv = new StringBuilder(txtFile.getName()).reverse().toString();
                int dot = rv.indexOf('.');
                String  ext =  new StringBuilder(((dot > 0) ? rv.substring(0, dot) : "")).reverse().toString();
                if (ext.equalsIgnoreCase("TXT") || ext.equalsIgnoreCase("MD")) {
                    txtForWork.add(txtFile.getName());
                }
            }
        }
        System.out.println("Выберете файл из списка: " + txtForWork.toString() );
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fname = sc.nextLine();

        while (!txtForWork.contains(fname)){
            System.out.println("Введите имя файла: ");
            fname = sc.nextLine();
        }
        System.out.println( "выбран = " + fname );

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fname)) ) {
            int n = isr.read();
            while ( -1 != n ) {
                System.out.print( (char)n );
                n = isr.read();
            }
            System.out.println("дополните файл: ");
            String inp = sc.nextLine();

            BufferedOutputStream fos = new BufferedOutputStream( new FileOutputStream( fname,true ));
            byte[] bb = (inp + '\n').getBytes();
            fos.write( bb );
            fos.flush();
            fos.close();
        } catch ( Exception  ex ) {
            ex.printStackTrace();
        }

    }
}
