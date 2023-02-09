package Bakery.src.controller;


import Bakery.src.model.Cookie;
import Bakery.src.model.Dough;
import Bakery.src.model.Recipe;

public interface CookieControllerI {

    Dough prepareDough(Recipe recipe);

    Cookie[] makeCookies(Dough dough);
}
