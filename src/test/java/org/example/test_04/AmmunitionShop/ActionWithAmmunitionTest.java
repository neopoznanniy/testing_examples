package org.example.test_04.AmmunitionShop;

import org.example.test_04.Ammunition.*;
import org.example.test_04.Main.Main;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActionWithAmmunitionTest {

    @Test
    void getEmptyShop() {
        Shop shop = new Shop(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition(shop);
        assertEquals(shop, actionWithAmmunition.getShop());
    }

    @Test
    void getNotEmptyShop() {
         List<MotorcycleHelmet> motorcycleHelmetList = Main.helmetsList();
         List<MotorcycleGloves> motorcycleGlovesList = Main.glovesList();
         List<MotorcycleJacket> motorcycleJacketList = Main.jacketList();
         List<MotorcycleTrousers> motorcycleTrousersList = Main.trousersList();
         List<MotorcycleBoots> motorcycleBootsList = Main.bootsList();

         Shop shop = new Shop(motorcycleHelmetList, motorcycleGlovesList, motorcycleJacketList,
                 motorcycleTrousersList, motorcycleBootsList);
         ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition(shop);
         assertEquals(shop, actionWithAmmunition.getShop());
    }

    @Test
    void setShop() {
        Shop shop1 = new Shop(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Shop shop2 = new Shop(Main.helmetsList(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        ActionWithAmmunition actionWithAmmunition = new ActionWithAmmunition(shop1);
        actionWithAmmunition.setShop(shop2);

        assertEquals(shop2, actionWithAmmunition.getShop());
    }

    @Test
    void showItemsInfo() {
    }

    @Test
    void isAmmunitionListNotEmpty() {
    }

    @Test
    void inputIndexValue() {
    }

    @Test
    void isInputIndexValidationTrue() {
    }

    @Test
    void parseValue() {
    }

    @Test
    void inputYesNoValue() {
    }

    @Test
    void isYesNoValidationTrue() {
    }

    @Test
    void isInputIndexNumberBeInRangeListSize() {
    }

    @Test
    void isDenial() {
    }

    @Test
    void isYesOrNo() {
    }

    @Test
    void selectAmmunition() {
    }

    @Test
    void sortByWeight() {
    }

    @Test
    void inputMaxMinValue() {
    }

    @Test
    void isMaxMinValidationTrue() {
    }

    @Test
    void findAndShowItemsInRangePrice() {
    }
}