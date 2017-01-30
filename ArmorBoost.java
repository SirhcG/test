/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tyrantunlashed2;

/**
 *
 * @author planb
 */
public class ArmorBoost extends CardBase implements CardSkill {
    
    private int Armor;
    
    public ArmorBoost(int Attack, int Health){
        super(Attack, Health);
        this.Armor = 25;
    }
    
     @Override
    public void setBoost() {
        int temp = this.getHealth();
        temp = temp + 25;
        this.setHealth(temp);
    }
    
  
    @Override
    public void checkSkill() {
        System.out.println("Cards Armor skill will increase Hp by 25 points !! \n");
    }

   
    
}
