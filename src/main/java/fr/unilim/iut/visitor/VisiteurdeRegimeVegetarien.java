package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurdeRegimeVegetarien implements VisiteurdeRegime {
	
	 public boolean visit(Agneau ingredient){
		 return false;
	 }
	 
	 public boolean visit(Boeuf ingredient){
		 return false;
	 }
	 
	 public boolean visit(Crevette ingredient){
		 return false;
	 }
	 
	 public boolean visit(Fromage ingredient){
		 return true;
	 }
	 
	 public boolean visit(Oignon ingredient){
		 return true;
	 }
	 
	 public boolean visit(Pain ingredient){
		 return true;
	 }
	 
	 public boolean visit(Salade ingredient){
		 return true;
	 }
	 
	 public boolean visit(Sauce ingredient){
		 return true;
	 }
	 
	 public boolean visit(Thon ingredient){
		 return false;
	 }
	 
	 public boolean visit(Tomate ingredient){
		 return true;
	 }

	@Override
	public boolean visit(Ingredient ingredient) {
		return true;
	}
}
