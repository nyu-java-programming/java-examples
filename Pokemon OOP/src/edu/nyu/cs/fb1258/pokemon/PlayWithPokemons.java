package edu.nyu.cs.fb1258.pokemon;

/**
 * Make a few Pokemon objects, give them moves and have them fight.
 * @author Foo Barstein
 * @version 0.1
 *
 */

public class PlayWithPokemons {

	public static void main(String[] args) {
		
		// setup pokemon types that we will use later
		Type water = new Type("Water");
		Type grass = new Type("Grass");
		Type fire = new Type("Fire");
		Type electric = new Type("Electric");
		Type rock = new Type("Rock");
		
		// setup a few moves that we will give to the various Pokemon characters we make
		Move quickAttack = new Move("Quick Attack", 90, 40);
		// tbd ... create more moves
		
		// make a Pokemon object or three...
		
		// instantiate a pokemon object from the class using one of the constructors
		Pokemon pikachu = new Pokemon("Pikachu", "yellow", 100, electric);
		pikachu.addMove(quickAttack);
		
		// instantiate another pokemon object from the class using one of the constructors
		Pokemon bulbasaur = new Pokemon("Bulbasaur", "teal", 100);
		bulbasaur.setType(grass);

		// instantiate another pokemon object from the class using one of the constructors
		Pokemon charmander = new Pokemon("Charmander");
		charmander.setColor("orange");
		charmander.setHealth(100);
		charmander.setType(fire);
		
		// have Pikachu make a "Quick Attack" move on Bulbasaur
		pikachu.makeMove(quickAttack, bulbasaur);
		
		// give Bulbasaur a "Colored orb" item, with 10 health points and 2 level points
		Item coloredOrb = new Item("Colored orb", 10, 2);
		coloredOrb.giveTo(bulbasaur);
		
	}

}
