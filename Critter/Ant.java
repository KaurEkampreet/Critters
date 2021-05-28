


import java.awt.*; // for Color
public class Ant extends Critter {

private boolean walkSouth;
private int moveNumber;

public Ant(boolean walkSouth) {
this.walkSouth = walkSouth;
}

//method comment goes here 
 public Attack fight(String opponent) {
 return Attack.SCRATCH;
 }
 
 public boolean eat() {
 return true;
 }
 
 public Direction getMove() { 
 //if walksouth is true, SE SE SE 
 if (walkSouth) {
  moveNumber = moveNumber + 1;

 if (moveNumber % 2 !=0) {
 return Direction.SOUTH;
 }
 else { //else nenenene
 return Direction.EAST;
 }
 }
 else { //else nenenene
 return Direction.NORTH;
 }
 }
 
//
 public Color getColor() {
 return Color.RED;
 }
 
//
 public String toString() {
 return "%";
 }
}