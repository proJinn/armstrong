package org;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Log {
    public static void out (String message, int type) {
        // TODO: Реализовать вывод сообщения с форматированием, учитывая тип
        // , см. пример

        // info
        // [YYYY-MM-DD, HH-MM-SS] Message

        // warning
        // [YYYY-MM-DD, HH-MM-SS] Message!

        // error
        // [YYYY-MM-DD, HH-MM-SS] MESSAGE!

        String date = new SimpleDateFormat("YYYY.MM.dd, HH:mm:ss").format(new Date());

        String typeMessage = "";

        switch (type) {
            case 0: {
                typeMessage = "[INFO]";
                break;
            }
            case 1: {
                typeMessage = "[WARNING]";
                break;
            }
            case 2: {
                typeMessage = "[ERROR]";
                break;
            }
        }

        System.out.println(date + " " + typeMessage + " " + message);
    }
}