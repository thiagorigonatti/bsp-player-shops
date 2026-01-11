package me.thiagorigonatti.bossshop;

import org.bukkit.Material;

public class NewSigns {

    public static boolean sign(Material material) {
        return material.name().endsWith("SIGN");
    }
}
