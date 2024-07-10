public class Item {
    String name;
    int price = 0;
    double health = 0;
    double armor = 0;
    double ad = 0;
    double magic_res = 0;
    double ap = 0;
    double as = 0;
    double crit_chance = 0;
    double crit_damage = 0;
    double lethality = 0;
    double armor_pen = 0;
    double magic_pen_flat = 0;
    double magic_pen = 0;
    double ability_haste = 0;

    public Item(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void setname(String x) {
        this.name = x;
    }

    public int getprice() {
        return this.price;
    }

    public void setprice(int x) {
        this.price = x;
    }

    public double gethealth() {
        return this.health;
    }

    public void sethealth(double x) {
        this.health = x;
    }

    public double getarmor() {
        return this.armor;
    }

    public void setarmor(double x) {
        this.armor = x;
    }

    public double getad() {
        return this.ad;
    }

    public void setad(double x) {
        this.ad = x;
    }

    public double getmagic_res() {
        return this.magic_res;
    }

    public void setmagic_res(double x) {
        this.magic_res = x;
    }

    public double getas() {
        return this.as;
    }

    public void setas(double x) {
        this.as = x;
    }

    public double getap() {
        return this.ap;
    }

    public void setap(double x) {
        this.ap = x;
    }

    public double getcrit_chance() {
        return this.crit_chance;
    }

    public void setcrit_chance(double x) {
        this.crit_chance = x;
    }

    public double getcrit_damage() {
        return this.crit_damage;
    }

    public void setcrit_damage(double x) {
        this.crit_damage = x;
    }

    public double getlethality() {
        return this.lethality;
    }

    public void setlethality(double x) {
        this.lethality = x;
    }

    public double getarmor_pen() {
        return this.armor_pen;
    }

    public void setarmor_pen(double x) {
        this.armor_pen = x;
    }

    public double getmagic_pen_flat() {
        return this.magic_pen_flat;
    }

    public void setmagic_pen_flat(double x) {
        this.magic_pen_flat = x;
    }

    public double getmagic_pen() {
        return this.magic_pen;
    }

    public void setmagic_pen(double x) {
        this.magic_pen = x;
    }

    public double getability_haste() {
        return this.ability_haste;
    }

    public void setability_haste(double x) {
        this.ability_haste = x;
    }

    public void showItemStat() {
        String expression = "" + this.name + " coute " + this.price + " PO, ";
        if (this.health > 0) {
            expression += "" + this.health + " HP, ";
        }
        if (this.armor > 0) {
            expression += "" + this.armor + " ARMOR, ";
        }
        if (this.ad > 0) {
            expression += "" + this.ad + " AD, ";
        }
        if (this.magic_res > 0) {
            expression += "" + this.magic_res + " MR, ";
        }
        if (this.ap > 0) {
            expression += "" + this.ap + " AP, ";
        }
        if (this.as > 0) {
            expression += "" + this.as + "% AS, ";
        }
        if (this.crit_chance > 0) {
            expression += "" + this.crit_chance + "% CRIT, ";
        }
        if (this.crit_damage > 0) {
            expression += "" + this.crit_damage + "% CRIT DAMAGE, ";
        }
        if (this.lethality > 0) {
            expression += "" + this.lethality + " LETHA, ";
        }
        if (this.armor_pen > 0) {
            expression += "" + this.armor_pen + "% ARMOR PEN, ";
        }
        if (this.magic_pen_flat > 0) {
            expression += "" + this.magic_pen_flat + " MPEN FLAT, ";
        }
        if (this.magic_pen > 0) {
            expression += "" + this.magic_pen + "% MPEN, ";
        }
        if (this.ability_haste > 0) {
            expression += "" + this.ability_haste + " ABILITY HASTE, ";
        }
        System.out.println(expression);
    }
}
