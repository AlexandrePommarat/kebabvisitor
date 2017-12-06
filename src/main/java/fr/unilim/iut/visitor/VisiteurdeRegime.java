package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Ingredient;

public interface VisiteurdeRegime {

		boolean visit(Ingredient ingredient);
}
