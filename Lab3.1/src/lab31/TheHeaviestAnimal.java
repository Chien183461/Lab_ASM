/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab31;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TheHeaviestAnimal {

    public String name;
    public float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public TheHeaviestAnimal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    public TheHeaviestAnimal() {
    }

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        ArrayList<TheHeaviestAnimal> list = new ArrayList<TheHeaviestAnimal>();
        do {
            System.out.println("Name of Animal " + count + ": ");
            String name = sc.next();
            System.out.println("Weight of Animal " + count + ": ");
            float w = sc.nextFloat();
            list.add(new TheHeaviestAnimal(name, w));
            count++;
        } while (count <= 5);

        int max_index = 0;
        float max = 0;
        for (int i = 0; i < list.size(); i++) {
            TheHeaviestAnimal x = (TheHeaviestAnimal) list.get(i);
            if (max < x.getWeight()) {
                max = x.getWeight();
                max_index = i;
            }
        }
        TheHeaviestAnimal maxi = (TheHeaviestAnimal) list.get(max_index);
        System.out.println("The Heaviest Animal: " + maxi.getName() + " weight " +maxi.getWeight());

    }
}
