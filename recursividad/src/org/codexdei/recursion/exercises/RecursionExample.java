package org.codexdei.recursion.exercises;

import org.codexdei.recursion.models.Component;

import java.util.stream.Stream;

public class RecursionExample {

    public static void main(String[] args) {

        Component pc = new Component("PC Corsair iCue RGB 5000X");
        Component powerSupply = new Component(" Power Supply Corsair RM750e");
        Component motherBoard = new Component("MotherBoard Asus ROG Strix Z790-A Gaming Wi-Fi II");
        Component cpu = new Component("CPU Intel Core i9-13900K");
        Component fan = new Component("Fan Corsair LL120 RGB");
        Component heatSink = new Component("HeatSink Corsair H150i Elite Capellix");
        Component graphicsCard = new Component("Graphics Card Nvidia GeForce RTX 5090");
        Component gpu = new Component("GPU Nvidia GeForce RTX 5090");
        Component gpuRam1 = new Component("GPU RAM 1 8GB RAM");
        Component gpuRam2 = new Component("GPU RAM 2 4GB RAM");
        Component gpuFan = new Component("GPU Fan 4GB RAM");
        Component ram = new Component("RAM Mamory Ram 32GB");
        Component ssd = new Component("SSD 2T");

        cpu.addComponent(fan)
           .addComponent(heatSink);

        graphicsCard.addComponent(gpu)
                .addComponent(gpuRam1)
                .addComponent(gpuRam2)
                .addComponent(gpuFan);

        motherBoard.addComponent(cpu)
                .addComponent(graphicsCard)
                .addComponent(ram)
                .addComponent(ssd);

        pc.addComponent(powerSupply)
                .addComponent(motherBoard)
                .addComponent(new Component("KeyBoard Cherry MX"))
                .addComponent(new Component("Mouse Lenovo"));

        methodRecursiveStream(pc,0).forEach(component -> System.out.println("\t".repeat(component.getLevel()) + component.getName()));

       //    methodRecursive(pc, 0);
    }

    public static Stream<Component> methodRecursiveStream(Component c, int level){

        c.setLevel(level);

        return  Stream.concat(Stream.of(c),
                c.getSons().stream().flatMap(component -> methodRecursiveStream(component,level +1)));
    }

    public static void methodRecursive(Component c, int level){

        System.out.println("\t".repeat(level) + c.getName());

        if (c.hasSons()){

            for (Component son : c.getSons()){

                methodRecursive(son, level + 1);
            }
        }
    }

}
