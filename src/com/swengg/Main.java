package com.swengg;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Apiary apiary = Apiary.getInstance();
		
		BeehiveBuilderDirector beehive1 = new BeehiveBuilderDirector();
		BeehiveBuilderDirector beehive2 = new BeehiveBuilderDirector();
		
		TickMediator mediator = new TickMediatorImpl();
		Bee bee1 = new BeeFamilyQueen(mediator);
		bee1.setBeeFamilyType("Queen");
		Bee bee2 = new BeeFamilyKiller(mediator);
		bee2.setBeeFamilyType("Killer");
		
		apiary.spawn(beehive1.getNewBeehive(0,0,bee1));
		apiary.spawn(beehive2.getNewBeehive(0,1,bee2));
		mediator.addBees(bee1);
		mediator.addBees(bee2);
		
		if(apiary.beehives.size()<2) {
			System.exit(0);
		}
		
		String currSpecies = null;
        String command = null;
        int PosX = 0;
        int PosY = 0;
        String x = "no";
        
        while(x.equalsIgnoreCase("no")) {
        System.out.println("Enter one of the following:");
        System.out.println("spawn : To produce more bees");
        System.out.println("tick: To know which bee is doing what at this tick\n");
        
        Scanner sc = new Scanner(System.in);
        int t;
        command = sc.next();
		
		switch (command) {
		case "spawn": {
			System.out.println("Enter the positions (x and y) where you want the new bee to spawn:");
			System.out.print("X:");
			PosX = sc.nextInt();
			System.out.print("Y:");
			PosY = sc.nextInt();
			
			System.out.println("Enter any of the following Bee Types:");
			System.out.println("Queen\nKiller\nDrone\nWarrior");
			
			currSpecies = sc.next();
			
			Bee b = new BeeFamilyQueen(mediator);
			switch (currSpecies){
				case "Drone":  b = new BeeFamilyDrone(mediator);
								break;
				case "Queen": b = new BeeFamilyQueen(mediator);
								break;
				case "Killer": b = new BeeFamilyKiller(mediator);
								break;
				case "Warrior": b = new BeeFamilyWarrior(mediator);
								break;
				default: break;
			}
			
			b.setBeeFamilyType(currSpecies);
			BeehiveBuilderDirector beehive = new BeehiveBuilderDirector();
			apiary.spawn(beehive.getNewBeehive(PosX,PosY,b));
			mediator.addBees(b);
			System.out.println("A new bee is added in beehive");
			break;
		}
		case "tick":{
			System.out.print("Enter the tick:");
			t = sc.nextInt();
			
			System.out.println("Enter any of the following Bee Types:");
			System.out.println("Queen\nKiller\nDrone\nWarrior");
			currSpecies = sc.next();
			
			Bee b = new BeeFamilyQueen(mediator);
			switch (currSpecies){
				case "Drone":  b = new BeeFamilyDrone(mediator);
								break;
				case "Queen": b = new BeeFamilyQueen(mediator);
								break;
				case "Killer": b = new BeeFamilyKiller(mediator);
								break;
				case "Warrior": b = new BeeFamilyWarrior(mediator);
								break;
				default: break;
			}
			
			b.setBeeFamilyType(currSpecies);
			b.statusAtThisTick(t);
			break;
		}
		default: break;
		}
		System.out.print("Want to quit ? ");
		x = sc.next();
		System.out.println("\n");
        }
		
		System.out.println("\n\nThe Beehive -----------------------------------");
		for(Beehive bh: apiary.getBeeHives()) {
			System.out.println("At position("+bh.getPositionX()+","+bh.getPositionY()+"): "+bh.getSpecies().getBeeFamilyType());
		}
    
	}

}
