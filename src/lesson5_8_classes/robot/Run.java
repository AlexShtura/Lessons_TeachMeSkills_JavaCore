package lesson5_8_classes.robot;

import lesson5_8_classes.robot.hands.SonyHand;
import lesson5_8_classes.robot.heads.SamsungHead;
import lesson5_8_classes.robot.legs.ToshibaLeg;

/*Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg).
Класс SonyHead является примером реализацией головы от Sony.
Создайте 3 робота с разными комплектующими.
Например у робота голова и нога от Sony а, рука от Samsung.
У всех роботов вызовите метод action.
Среди 3-х роботов найдите самого дорогого.*/

public class Run {
    public static void main(String[] args) {

        Robot tom = new Robot(new SamsungHead(), new SonyHand(), new ToshibaLeg());
        //tom.getPrice(500,400,300);
    }
}
