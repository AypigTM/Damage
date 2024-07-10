import java.util.Arrays;

public class Champ {
    String name;
    double lvl;
    double health = 0;
    double current_health;
    double base_health;
    double health_lvl;
    double armor = 0;
    double base_armor;
    double armor_lvl;
    double ad = 0;
    double base_ad;
    double ad_lvl;
    double magic_res = 0;
    double base_magic_res;
    double magic_res_lvl;
    double as = 0;
    double base_as;
    double as_ratio;
    double as_lvl;
    double bonus_as = 0;
    double ap = 0;
    double crit_chance = 0;
    double crit_damage = 0.75;
    int item_number = 0;
    String items[] = new String[6];
    double lethality = 0;
    double armor_pen = 0;
    double magic_pen_flat = 0;
    double magic_pen = 0;
    double ability_haste = 0;

    public Champ(String name, double lvl, double base_health, double health_lvl, double base_armor,
            double armor_lvl,
            double base_ad, double ad_lvl, double base_magic_res, double magic_res_lvl, double base_as, double as_ratio,
            double as_lvl) {
        this.name = name;
        this.lvl = lvl;
        this.base_health = base_health;
        this.health_lvl = health_lvl;
        this.base_armor = base_armor;
        this.armor_lvl = armor_lvl;
        this.base_ad = base_ad;
        this.ad_lvl = ad_lvl;
        this.base_magic_res = base_magic_res;
        this.magic_res_lvl = magic_res_lvl;
        this.base_as = base_as;
        this.as_ratio = as_ratio;
        this.as_lvl = as_lvl;
        lvlUp();
    }

    public double getlvl() {
        return this.lvl;
    }

    public void setlvl(double x) {
        this.lvl = x;
    }

    public double gethealth() {
        return this.health;
    }

    public void sethealth(double x) {
        this.health = x;
    }

    public double getcurrent_health() {
        return this.current_health;
    }

    public void setcurrent_health(double x) {
        this.current_health = x;
    }

    public double getbase_health() {
        return this.base_health;
    }

    public void setbase_health(double x) {
        this.base_health = x;
    }

    public double gethealth_lvl() {
        return this.health_lvl;
    }

    public void sethealth_lvl(double x) {
        this.health_lvl = x;
    }

    public double getarmor() {
        return this.armor;
    }

    public void setarmor(double x) {
        this.armor = x;
    }

    public double getbase_armor() {
        return this.base_armor;
    }

    public void setbase_armor(double x) {
        this.base_armor = x;
    }

    public double getarmor_lvl() {
        return this.armor_lvl;
    }

    public void setarmor_lvl(double x) {
        this.armor_lvl = x;
    }

    public double getad() {
        return this.ad;
    }

    public void setad(double x) {
        this.ad = x;
    }

    public double getbase_ad() {
        return this.base_ad;
    }

    public void setbase_ad(double x) {
        this.base_ad = x;
    }

    public double getad_lvl() {
        return this.ad_lvl;
    }

    public void setad_lvl(double x) {
        this.ad_lvl = x;
    }

    public double getmagic_res() {
        return this.magic_res;
    }

    public void setmagic_res(double x) {
        this.base_magic_res = x;
    }

    public double getbase_magic_res() {
        return this.magic_res;
    }

    public void setbase_magic_res(double x) {
        this.base_magic_res = x;
    }

    public double getmagic_res_lvl() {
        return this.magic_res_lvl;
    }

    public void setmagic_res_lvl(double x) {
        this.magic_res_lvl = x;
    }

    public double getas() {
        return this.as;
    }

    public void setas(double x) {
        this.as = x;
    }

    public double getbase_as() {
        return this.base_as;
    }

    public void setbase_as(double x) {
        this.base_as = x;
    }

    public double getas_lvl() {
        return this.as_lvl;
    }

    public void setas_lvl(double x) {
        this.as_lvl = x;
    }

    public double getas_bonus() {
        return this.bonus_as;
    }

    public void setas_bonus(double x) {
        this.bonus_as = x;
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

    public void setlehtality(double x) {
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

    public void getitems() {
        System.out.println("Total de " + this.item_number + " items: " + Arrays.toString(this.items));
    }

    public void lvlUp() {
        as_lvl();
        health_lvl();
        ad_lvl();
        armor_lvl();
        magic_res_lvl();
    }

    public void as_lvl() {
        this.bonus_as += this.as_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1));
        this.as = Math.round(100 * (this.as_ratio * (this.bonus_as) + this.base_as)) * 0.01;
    }

    public void health_lvl() {
        this.health = Math.round(
                100 * (this.base_health + this.health_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1))))
                * 0.01;
        this.current_health = this.health;
    }

    public void ad_lvl() {
        this.ad = Math.round(100 * (this.base_ad + this.ad_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1))))
                * 0.01;
    }

    public void armor_lvl() {
        this.armor = Math.round(
                100 * (this.base_armor + this.armor_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1)))) * 0.01;
    }

    public void magic_res_lvl() {
        this.magic_res = Math.round(
                100 * (this.base_magic_res + this.magic_res_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1))))
                * 0.01;
    }

    public void showStat() {
        System.out.println(this.name + " a " + this.health + " HP, " + this.ad + " AD " + this.as + "% AS, "
                + this.armor + " ARMOR, "
                + this.magic_res + " RM quand il est LVL " + this.lvl);
    }

    public void showMitigation() {
        System.out.println(this.name + " a " + armorMitigation() + "% de reduction des dégats physique et "
                + mrMitigation() + "% de réduction des degats magiques");
    }

    public double armorMitigation() {
        return (1 - (Math.round(100000 / (100 + this.armor)) * 0.001)) * 100;
    }

    public double mrMitigation() {
        return (1 - (Math.round(100000 / (100 + this.magic_res)) * 0.001)) * 100;
    }

    public void add_item(Item item) {
        if (this.item_number < 6) {
            this.item_number += 1;
            items[item_number - 1] = item.getname();
            this.health += item.gethealth();
            this.current_health = this.health;
            this.armor += item.getarmor();
            this.ad += item.getad();
            this.magic_res += item.getmagic_res();
            this.ap += item.getap();
            this.crit_damage += item.getcrit_damage();
            this.crit_chance += item.getcrit_chance();
            this.lethality += item.getlethality();
            this.armor_pen += item.getarmor_pen();
            this.magic_pen_flat += item.getmagic_pen_flat();
            this.magic_pen += item.getmagic_pen();
            this.ability_haste += item.getability_haste();
            this.bonus_as += item.getas() - this.as_lvl * (this.lvl - 1) * (0.7025 + 0.0175 * (this.lvl - 1));
            as_lvl();
        }
    }

    public void delete_item(Item item) {
        if (this.item_number > 0) {
            for (int j = 0; j < 6; j++) {
                if (this.items[j] == item.getname()) {
                    this.items[j] = null;
                    remove_stat_item(item);
                }
            }
        }
    }

    private void remove_stat_item(Item item) {
        this.item_number -= 1;
        this.health -= item.gethealth();
        this.current_health = this.health;
        this.armor -= item.getarmor();
        this.ad -= item.getad();
        this.magic_res -= item.getmagic_res();
        this.ap -= item.getap();
        this.crit_damage -= item.getcrit_damage();
        this.crit_chance -= item.getcrit_chance();
        this.lethality -= item.getlethality();
        this.armor_pen -= item.getarmor_pen();
        this.magic_pen_flat -= item.getmagic_pen_flat();
        this.magic_pen -= item.getmagic_pen();
        this.ability_haste -= item.getability_haste();
        this.bonus_as -= item.getas();
        as_lvl();
    }

    public double applyapen(Champ def, Champ att) {
        return 100 / (100
                + ((def.getarmor() - (att.getlethality() * (0.6 + 0.4 * att.lvl / 18))) * (0.6 + 0.4 * att.lvl / 18))
                        * (1 - att.getarmor_pen()));
    }

    public double crit_multiplier() {
        double number = Math.random();
        if (number <= this.crit_chance) {
            return 1 + this.crit_damage;
        } else {
            return 1;
        }
    }

    public String show(){
        return (this.name + " " + this.current_health + " / " + this.health + " HP");
    } 
}
