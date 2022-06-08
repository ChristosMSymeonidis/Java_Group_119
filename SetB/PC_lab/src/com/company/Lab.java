package com.company;

import java.util.ArrayList;

public class Lab {
    private String name;
    private ArrayList<PC> computers;
    /*    Constructors */
    public Lab() {
        this.computers = new ArrayList<>();
    }

    /*    Methods     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addComputer(PC npc) {
        computers.add(npc);
    }

    public int workingPCs() {
        int counter = 0;
        for (int i = 0; i < computers.size(); i++) {
            if (!computers.get(i).getOperational()) {
                System.out.println(computers.get(i).toString());

            } else {
                counter++;
            }
        }
        return counter;
    }

    public boolean installApp(float size) {
        boolean flag_free_space = true;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getFreeSpace() < size) {
                flag_free_space = false;
            }
        }
        if (flag_free_space == true) {
            System.out.println("I egkatastasi tha ginei ");
            for (int i = 0; i < computers.size(); i++) {
                computers.get(i).setFreeSpace(computers.get(i).getFreeSpace() - size);
            }// elegxos

        }
        else{System.out.println("I egkatastasi den tha ginei ");}
        return flag_free_space;
    }

    public void pcStatus(int index, boolean status) {
        computers.get(index).setOperational(status) ;
    }

    public boolean checkSpecs(float freq, int ram, float size) {
        boolean all_pcs_ok = true;
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getFreeSpace() <= size || computers.get(i).getRAM() <= ram || computers.get(i).getFrequency() <= freq) {
              System.out.println(computers.get(i).toString());
              all_pcs_ok = false;
            }
        }
        return all_pcs_ok;
    }

    public String toString() {
        return "Lab :   " + name +
                "\nYpologistes  :\n " + computers.toString();
    }

}
