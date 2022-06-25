package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /*Arraylistt me tria dromologia */
        ArrayList<Route> dromologia = new ArrayList<Route>();

        /*Oi metavlites typou Train  dimiourgithikan giati kathe dromologio ginetai apo kapoio treno me sygkekrimeno id  pou prepei na gnwrizoume
       ,auto pernaei stis metavlites typou route mesw tou constructora me orismata tous*/
        // d1
        Train train1 = new Train(1, "model1", 5);
        Route d1 = new Route(1,731, "Kozani", "Ioannina", new ArrayList<>(), train1);
        // d2
        Train train2 = new Train(2, "model2", 5);
        Route d2 = new IndirectRoute(2,114, "Kozani", "Veroia", new ArrayList<>(), train2, "Polymylos");
        // d3
        Train train3 = new Train(3, "model3", 5);
        Route d3 = new Route(3,666, "Kozani", "Larisa", new ArrayList<>(), train3);

        /*Prosthiki twn dromologiwn sto arraylist */
        dromologia.add(d1);
        dromologia.add(d2);
        dromologia.add(d3);

        // epivatis sto d1
        Ticket ticket1 = new Ticket(1, "Xristos", "Kozani", "Ioannina", 10f, 10f);
        d1.addTicket(ticket1);
        // epivatis sto  d2
       Ticket ticket2 = new Ticket(2, "Kostas", "Kozani", "Veroia", 0f, 10f);// distance = 0 na xtipisei to exception
       d2.addTicket(ticket2);

        //Ekteleseis tis finalize
        d1.finalize(); //   ok
        d2.finalize(); //
        d3.finalize();//   ok
    }
    }

