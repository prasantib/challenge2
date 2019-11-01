import java.util.Random;

public class Burritos {

	public static final String[] ingredients = { "riceOption", "meatOption", "beansOption", "salsaOption",
			"veggiesOption", "cheeseOption", "guacOption", "quesoOption", "sourcreamOption" };
	public static final String[] RICE = { "white", "brown", "no rice", "all" };
	public static final String[] MEAT = { "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "no meat",
			"all" };
	public static final String[] BEANS = { "pinto", "black", "no beans" };
	public static final String[] SALSA = { "mild", "medium", "hot", "no salsa", "all" };
	public static final String[] VEGGIES = { "lettuce", "fajita veggies", "no veggies", "all" };
	public static final boolean[] CHEESE = { true, false };
	public static final boolean[] GUAC = { true, false };
	public static final boolean[] QUESO = { true, false };
	public static final boolean[] SOURCREAM = { true, false };

	public static void main(String[] args) {

		for (int count = 1; count <= 25; count++) {
			System.out.println("Burrito: " + count);
			Random rand = new Random();
			int x = 5 + rand.nextInt(4);
			System.out.println("Ingrediants Requested:" + x);
			int ricerandomOption = new Random().nextInt(RICE.length);
			int meatrandomOption = new Random().nextInt(MEAT.length);
			int beansrandomOption = new Random().nextInt(BEANS.length);
			int salsarandomOption = new Random().nextInt(SALSA.length);
			int veggiesrandomOption = new Random().nextInt(VEGGIES.length);
			int cheeserandomOption = new Random().nextInt(CHEESE.length);
			int guacrandomOption = new Random().nextInt(GUAC.length);
			int quesorandomOption = new Random().nextInt(QUESO.length);
			int sourcreamrandomOption = new Random().nextInt(SOURCREAM.length);
			int totalIngredients = 0;

			for (String ingredient : ingredients) {
				if (totalIngredients >= x)
					break;
				switch (ingredient) {
				case "riceOption":
					if (ricerandomOption == 0 || ricerandomOption == 1) {
						totalIngredients++;
						System.out.println("Rice:"+RICE[ricerandomOption]);
					} else if (ricerandomOption == 2) {

					} else if (ricerandomOption == 3) {
						totalIngredients += 2;
						System.out.println("Rice:"+RICE[ricerandomOption]);
					}
					break;
				case "meatOption":
					if (meatrandomOption == 0 || meatrandomOption == 1 || meatrandomOption == 2 || meatrandomOption == 3
							|| meatrandomOption == 4 || meatrandomOption == 5) {
						totalIngredients++;
						System.out.println("Meat:"+MEAT[meatrandomOption]);
					} else if (meatrandomOption == 6) {

					} else if (meatrandomOption == 7) {
						totalIngredients += 6;
						System.out.println("Meat:"+MEAT[meatrandomOption]);
					}
					break;

				case "beansOption":
					if (beansrandomOption == 0 || beansrandomOption == 1) {
						totalIngredients++;
						System.out.println("Beans:"+BEANS[beansrandomOption]);
					} else if (beansrandomOption == 2) {

					} else if (beansrandomOption == 3) {
						totalIngredients += 2;
						System.out.println("Beans:"+BEANS[beansrandomOption]);
					}
					break;
				case "salsaOption":
					if (salsarandomOption == 0 || salsarandomOption == 1 || salsarandomOption == 2) {
						totalIngredients++;
						System.out.println("SALSA:"+SALSA[salsarandomOption]);
					} else if (salsarandomOption == 3) {

					} else if (salsarandomOption == 4) {
						totalIngredients += 3;
						System.out.println("SALSA:"+SALSA[salsarandomOption]);
					}
					break;
				case "veggiesOption":
					if (veggiesrandomOption == 0 || veggiesrandomOption == 1) {
						totalIngredients++;
						System.out.println("VEGGIES:"+VEGGIES[veggiesrandomOption]);
					} else if (veggiesrandomOption == 2) {

					} else if (veggiesrandomOption == 3) {
						totalIngredients += 2;
						System.out.println("VEGGIES:"+VEGGIES[veggiesrandomOption]);
					}
					break;
				case "cheeseOption":
					if (cheeserandomOption == 0) {
						totalIngredients++;
						System.out.println("CHEESE:"+CHEESE[cheeserandomOption]);
					} else if (cheeserandomOption == 0) {

					}
					break;
				case "guacOption":
					if (guacrandomOption == 0) {
						totalIngredients++;
						System.out.println("GUAC:"+GUAC[guacrandomOption]);
					} else if (guacrandomOption == 0) {

					}
					break;
				case "quesoOption":
					if (quesorandomOption == 0) {
						totalIngredients++;
						System.out.println("QUESO:"+QUESO[quesorandomOption]);
					} else if (quesorandomOption == 0) {

					}
					break;
				case "sourcreamOption":
					if (sourcreamrandomOption == 0) {
						totalIngredients++;
						System.out.println("Sour Cream:"+SOURCREAM[sourcreamrandomOption]);
					} else if (sourcreamrandomOption == 0) {

					}
					break;
				}
			}
			
			System.out.println("Burrito Cost:" +3*(x*0.5));

		}

	}

}