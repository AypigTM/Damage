public class Fight {
    Champ fighter1;
    float fighter1_damage;
    Champ fighter2;
    float fighter2_damage;

    public Fight(Champ fighter1, Champ fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public Champ getfighter1() {
        return fighter1;
    }

    public void setfighter1(Champ x) {
        this.fighter1 = x;
    }

    public Champ getfighter2() {
        return fighter2;
    }

    public void setfighter2(Champ x) {
        this.fighter2 = x;
    }

    public float getfighter1_damage() {
        return fighter1_damage;
    }

    public void setfighter1_damage(float x) {
        this.fighter1_damage = x;
    }

    public float getfighter2_damage() {
        return fighter2_damage;
    }

    public void setfighter2_damage(float x) {
        this.fighter2_damage = x;
    }

    public void auto_attack(Champ def, Champ att) {
        double damage = 0;
        damage = att.getad() * def.applyapen(def, att) * att.crit_multiplier();
        def.current_health -= Math.round(damage);
        def.show();
    }

    public void garen_q(Champ def, Champ att) {
        double damage = att.getad() * def.applyapen(def, att) * att.crit_multiplier();
        if (att.getlvl() >= 13) {
            damage += (150 + att.getad() * 0.5) * def.applyapen(def, att);
        } else if (att.getlvl() >= 12) {
            damage += (120 + att.getad() * 0.5) * def.applyapen(def, att);
        } else if (att.getlvl() >= 10) {
            damage += (90 + att.getad() * 0.5) * def.applyapen(def, att);
        } else if (att.getlvl() >= 8) {
            damage += (60 + att.getad() * 0.5) * def.applyapen(def, att);
        } else if (att.getlvl() <= 3) {
            damage += (30 + att.getad() * 0.5) * def.applyapen(def, att);
        }
        def.current_health -= Math.round(damage);
        System.out.println(def.show());
    }

    public void garen_e(Champ def, Champ att) {
        double damage = 0;
        double damage_multiplier = def.applyapen(def, att);
        double spin = 7 + Math.round((att.getas_bonus() * 100) / 25);
        for (int j = 1; j <= spin; j++) {
            if (j == 6) {
                damage_multiplier = 100 / (100 + ((def.getarmor() - (att.getlethality() * (0.6 + 0.4 * att.lvl / 18)))
                        * (0.6 + 0.4 * att.lvl / 18))
                        * (1 - att.getarmor_pen()) * 0.75);
            }
            if (att.getlvl() >= 9) {
                damage += (25 + (10.25 / 18 * att.getlvl()) + att.getad() * 0.5) * damage_multiplier
                        * att.crit_multiplier();
            } else if (att.getlvl() >= 7) {
                damage += (20 + (10.25 / 18 * att.getlvl()) + att.getad() * 0.5) * damage_multiplier
                        * att.crit_multiplier();
            } else if (att.getlvl() >= 5) {
                damage += (15 + (10.25 / 18 * att.getlvl()) + att.getad() * 0.5) * damage_multiplier
                        * att.crit_multiplier();
            } else if (att.getlvl() >= 4) {
                damage += (10 + (10.25 / 18 * att.getlvl()) + att.getad() * 0.5) * damage_multiplier
                        * att.crit_multiplier();
            } else if (att.getlvl() <= 3) {
                damage += (5 + (10.25 / 18 * att.getlvl()) + att.getad() * 0.5) * damage_multiplier
                        * att.crit_multiplier();
            }
        }
        def.current_health -= Math.round(damage);
        System.out.println(def.show());
    }

    public void garen_r(Champ def, Champ att) {
        double new_c_hp = def.health;
        if (att.lvl >= 16) {
            while (Math.round(new_c_hp) > Math.round((def.health - new_c_hp) * 0.35 + 450)) {
                new_c_hp--;
            }

            System.out.println(def.name + " mourra de l'ult garen à "
                    + Math.round(100 * new_c_hp / def.health * 100) * 0.01 + "% de ses HPmax");
        } else if (att.lvl >= 11) {
            while (Math.round(new_c_hp) > Math.round((def.health - new_c_hp) * 0.30 + 300)) {
                new_c_hp--;
            }

            System.out.println(def.name + " mourra de l'ult garen à "
                    + Math.round(100 * new_c_hp / def.health * 100) * 0.01 + "% de ses HPmax");
        } else {
            while (Math.round(new_c_hp) > Math.round((def.health - new_c_hp) * 0.25 + 150)) {
                new_c_hp--;
            }
            System.out.println(def.name + " mourra de l'ult garen à "
                    + Math.round(100 * new_c_hp / def.health * 100) * 0.01 + "% de ses HPmax");

        }
    }

    public void gold() {
        float range = 15;
        float mele = 20;
        float canon = 40;
    }

}
