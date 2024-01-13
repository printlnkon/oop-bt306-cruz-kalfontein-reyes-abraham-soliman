import java.util.*;

public class Story extends TorF {

    static Scanner scan = new Scanner(System.in);

    public Story (String name) {
        super(name);
    }

    @Override
    public void intro () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Mapayapa kang namumuhay sa siyudad at maganda iyong buhay. \n" + "Napakasagana at maraming masayang alaala ang naiwan sa iyong pamumuhay. \n" + "Isang araw, nagbakasyon ka sa isang napakamisteryosong isla at sumakay \nkayo sa isang helicopter. " + "Sumunod na pangyayare ikaw ay masaya pang tumatanaw sa \nbuong kalupaan nang biglang tumama ang isang " + "malakas na kidlat sa elesi ng \nhelicopter at yumanig ang helicopter. \nPagkatapos nito ay ikaw lang " + "ang nakaligtas sa trahedya. \nSunod nito, dumako ka sa tuktok ng bundok dahil hindi mo makita \nang kalupaan dahil ma-puno.");
        LineSeparator.lineSeparator();
        System.out.println("Ngayon, kailangan mong pumili ng daan:");
        System.out.println("1. Hilaga");
        System.out.println("2. Kanluran");
        System.out.println("3. Timog");
        int choice = Player.readInt("=====> ", 3);
        if (choice == 1) {
            outro();
        } else if (choice == 2) {
            outro1();
        } else if (choice == 3) {
            outro2();
        }
    }

    @Override
    public void outro () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Pumunta ka sa hilaga bahagi ng isla nakakita ka ng magandang diwata na nag ngangalang Rodolfo\n" + "Siya pala ay isang dating lalaki malaki daw discount sa Thailand buy 1 take one ang promo. Kaya nagtanong\n" + "ka papuntang thailand san po papuntang thailand napaisip ka para ikay makatakas sa isang islang salamuot.\n" + "Ngayon, pinapapili ka ng matanda anong dadalhin mo sa kanya ito ang pinapapili niya sayo\n" + "para masagot niya ang papuntang Thailand.");
        LineSeparator.lineSeparator();
        System.out.println("1. Hotdog ni Aljur");
        System.out.println("2. Batuta ni Manong Johny");
        int choice = Player.readInt("=====> ", 2);
        if (choice == 1) {
            end();
        } else if (choice == 2) {
            end1();
        }
    }

    @Override
    public void outro1 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Pumunta ka sa kanluran at mapayapa mong titigan ang isang paglubog ng araw\n" + "pagtapos nito may nakita kang sirena na lumalangoy sa dalampasigan at nakita mo \n" + "ang kanyang taglay na ganda biglang pagharap ng sirena mukha palang shokoy \n" + "dali dali kang nagtago at may nakita kang kweba kaso pipili ka ng\n" + "kweba na papasukan mo.\n");
        LineSeparator.lineSeparator();
        System.out.println("Anong kweba ang papasukin mo?");
        System.out.println("1. Kwebang masikip");
        System.out.println("2. Kwebang maluwag na");
        int choice = Player.readInt("=====> ", 2);
        if (choice == 1) {
            end2();
        } else if (choice == 2) {
            end3();
        }
    }

    @Override
    public void outro2 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Pumunta Sa Timog bahagi alam mo ang timog malakas ang hangin \n" + "akala mo ay parang may malakas na bagyo na paparating pagpalo ng hangin\n" + "at tinangay ka papuntang silangan ng isla dahil sa sobrang lakas\n" + "nawalan ka ng malay pagkagising ng umaga kitang kita ang \n" + "pagsikat ng araw. may nakita kang nakalapag isang \n" + "buko at isang treasure chest\n" + "ang tanong ano ang pipiliin mong buksan?");
        LineSeparator.lineSeparator();
        System.out.println("1. Buko");
        System.out.println("2. Treasure Chest");
        int choice = Player.readInt("=====> ", 2);
        if (choice == 1) {
            end4();
        } else if (choice == 2) {
            end5();
        }
    }

    @Override
    public void end () {
        cast a = new Aljur();
        int num1, num2;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Libot ka nang libot sa buong isla at hindi mo mahanap ang hotdog ni Aljur. \n" + "Hangang sa may naamoy kang nagiihaw ng barbeque at nakita mo si Aljur imbis na barbeque tanungin mo\n" + "dahil bobo ka tinanong mo kung may hotdog siya");
        System.out.println();
        a.dialogue();
        System.out.println();
        System.out.println(name + ": May hotdog po ba kayo Aljur?");
        System.out.println();
        System.out.println("Aljur: May hotdog ako bibigay ko lang sayo ang hotdog ko sa isang kundisyon\n" + "Ano ang pangalan mo? ");
        System.out.println();
        System.out.println(name + ": " + name + " po ang aking pangalan anong kundisyon po ito?");
        System.out.println();
        System.out.println("Aljur: bigyan mo ako dalawang numero pag in-add magiging sampu.\n" + "kailangan 1-10");
        LineSeparator.lineSeparator();
        System.out.print(name + ": ");
        System.out.println();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("Aljur: at ");
        num2 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2);

        if (ans == 10) {
            System.out.println("Aljur: Dahil Jan bibigay ko na sayo ang hotdog ibigay mo\n" + "sa diwatang dating lalaki");
            finished();
        } else {
            System.out.println("Aljur: EEEEE MALLLIIIIIIII!!!!!");
            end();
        }
    }

    @Override
    public void end1 () {
        cast mj = new MangJohnny();
        int num1, num2, num3;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Ngayon namomoblema ka maghanap ng batuta ni mang johnny\n" + "bakit kasi naisip ito ng diwata aanhin ba ng diwata\n" + "ang hotdog ni Aljur o kaya batuta ni mang johnny " + "pero wala nandito na ako napili ko na ang batuta ni mang johnny\n" + "hangang nakita ko si Johnny Sins naglalakbay sa dalampasigan ng kanluran" + "nakita ko kinakana niya ang sirenang mukhang shokoy");
        System.out.println();
        mj.dialogue();
        System.out.println();
        System.out.println(name + ": bakit po kayo kumakana ng isang sirena");
        System.out.println();
        System.out.println("Johny: Siyempre Para may ulam mamaya anong pangalan mo?");
        System.out.println();
        System.out.println(name + ": " + name + " po ang aking pangalan ganun po ba?\n" + "kayo po ba si mang johnny kailangan ko kasi batuta niyo");
        System.out.println();
        System.out.println("Johny : Mapagbigay naman ako pero ibibigay ko lang to sa isang kondisyon");
        System.out.println();
        System.out.print(name + ": Anong Kondisyon po?");
        System.out.println();
        System.out.println("Johny: Magbigay ka ng tatlong numero dapat hindi \n" + "magkukulang o sosobra paginadd mo 16 dapat ang resulta 1-10 lang dapat/n" + " tataya ko kasi sa ez3");
        System.out.println();
        System.out.print(name + ": Bakit naman  napili na 16 napili niyo sir");
        System.out.println();
        System.out.println("Johny: kasi ayun kasi monthsary ng bebe loves ko. Game ka na?");
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.print(name + ": Game na! Hmmm ano kaya TATLONG NUMERO:");
        System.out.println();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("Johny: at ");
        num2 = Player.readInt("1-10: ", 10);
        System.out.println("Johny: at ");
        num3 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2, num3);
        for (int i = 0; i < 1000; i++) {
            if (ans == 16) {
                System.out.println("Johny: Dahil jan bibigay ko na sayo ang batuta ko ibigay mo\n" + "ito sa diwatang dating lalaki");
                finished1();
                break;
            } else {
                System.out.println("Johny: EEEEE MALLLIIIIIIII!!!!!");
                end1();
            }
        }
    }

    @Override
    public void end2 () {
        int num1, num2, num3, num4;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Dahil masikip ang pinili mo tuwang tuwa ka naman\n" + "alam kong mahilig ka sa masikip nakalapat ang isang pintong \n" + "at dali dali mong buksan ang kaso hindi mo ito mabuksan\n" + "nakita mo ang nakasulat sa isang pinto \n" + "ang nakalagay sa pinto: Magbigay ng apat na combinasyon\n" + "kapag inadd ang apat na combinasyon magiging twenty" + "\nAng Twist neto kailangan hindi baba 0 ang given number\n" + "at di aakyat ng sampu");
        LineSeparator.lineSeparator();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("PINTO: at ");
        num2 = Player.readInt("1-10: ", 10);
        System.out.println("PINTO: at ");
        num3 = Player.readInt("1-10: ", 10);
        System.out.println("PINTO: at ");
        num4 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2, num3, num4);
        for (int i = 0; i < 1000; i++) {
            if (ans == 20) {
                System.out.println("Pwede ka na pumasok sa kwebang masikip.");
                finished2();
                break;
            } else {
                System.out.println("Mali ang password.");
                end2();
            }
        }
    }

    @Override
    public void end3 () {
        cast b = new bata();
        int num1, num2, num3, num4, num5;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Napagisip ka bakit kaya itong maluwag napili ko?\n" + "napaisip kang husto pero dahil ako ang narator ako bahala sa kwento\n" + "may nakita kang pagkain sa loob ng malaking kweba, may kasangsangan \n" + "amoy, AMOY PATIS. dali dali kang naghanap pantakip sa ilong sakto may\n" + "batang lalaki na nagaalok ng facemask\n" + "pero bago muna yun meron siyang kundisyon");
        System.out.println();
        b.dialogue();
        System.out.println();
        System.out.println("Bata: Facemask kayo jan");
        System.out.println();
        System.out.println(name + ": Bata penge facemask bakit hindi ka nakafacemask\n" + "samantalang meron ka naman nito. hindi kaba nababahuan" + "");
        System.out.println();
        System.out.println("Bata: Masarap amuyin ang patis lalo na kapag sinigang ang ulam");
        System.out.println();
        System.out.println(name + ": Osha penge na ako face mask");
        System.out.println();
        System.out.println("Bata: Magbigay ka muna ng limang numero kapag inaadd mo \n" + "magiging 45 dapat di lalagpas 1-10? game?");
        System.out.println();
        System.out.println(name + ": Pesteng Bata to pinagisip pako? \n" + "O sige kaysa mamatay ako sa baho");
        LineSeparator.lineSeparator();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("Bata: Tapos po? ");
        num2 = Player.readInt("1-10: ", 10);
        System.out.println("Bata: Tapos po? ");
        num3 = Player.readInt("1-10: ", 10);
        System.out.println("Bata: Tapos po?");
        num4 = Player.readInt("1-10: ", 10);
        System.out.println("Bata: Tapos po?");
        num5 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2, num3, num4, num5);
        for (int i = 0; i < 1000; i++) {
            if (ans == 45) {
                System.out.println("Bata: ITO NA FACEMASK MO ");
                finished3();
                break;
            } else {
                System.out.println("Bata: MAS MATALINO PA YATA AKO SAYO MALIIIIIIIIII ");
                end3();
            }
        }
    }

    @Override
    public void end4 () {
        cast bat = new bathala();
        int num1, num2, num3, num4, num5, num6;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Naglalakad sa buhanginan at nagiisip paano ko kaya mabubuksan\n" + "itong buko. at bigla kang nadapa. may nakausling tali dali dali mo tong\n" + "hinawakan tas may nakita kang itak na nakatali pero sa sobrang higpit" + "hindi mo namalayan nakatali pala ang isang oso dali dali kang tumakbo\n" + "at naligaw ka napunta ka maluwag na kweba\n" + "anong kweba to amoy patis ang bantot naman sabay alis na\n" + "may nakita kang itak nakabaon sa lupa \n" + "ang sabi mo pa tamang tama para yan buko ko");
        System.out.println();
        bat.dialogue();
        System.out.println();
        System.out.println(name + ": bakit ang hirap naman hugutin");
        System.out.println();
        System.out.println("Bathala: ibibigay ko sayo yan kapag nasagot mo katanungan ko");
        System.out.println();
        System.out.println(name + ": Sino ka po san kapo d po kita makita");
        System.out.println();
        System.out.println("Bathala: Ako ang bathala ng kwebang ito");
        System.out.println();
        System.out.println(name + ": Ano po bang katanungan ibibigay niyo po?");
        System.out.println();
        System.out.println("Bathala: kailangan makapagbigay ka ng anim na numero \n" + "at inaadd mo sila ang resulta ay 59: 1-10 only lang ha");
        System.out.println(name + ": Osige po para sa buko! Hmnn ano kaya sagot ko");
        LineSeparator.lineSeparator();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("Bathala: Ano pa? ");
        num2 = Player.readInt("1-10: ", 10);
        System.out.println("Bathala: Ano pa? ");
        num3 = Player.readInt("1-10: ", 10);
        System.out.println("Bathala: Ano pa? ");
        num4 = Player.readInt("1-10: ", 10);
        System.out.println("Bathala: Ano pa? ");
        num5 = Player.readInt("1-10: ", 10);
        System.out.println("Bathala: Ano pa? ");
        num6 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2, num3, num4, num5, num6);
        for (int i = 0; i < 1000; i++) {
            if (ans == 59) {
                System.out.println("Bathala: ITO NA ANG IYONG ITAK . ITAK NI LAPULAPU ");
                System.out.println("Bathala: Lumayas ka na baka itaktak pa kita");
                finished4();
                break;
            } else {
                System.out.println("WRONG PASSWORD ");
                end4();
            }
        }
    }

    @Override
    public void end5 () {
        int num1, num2, num3, num4, num5, num6, num7;
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Na Curious ka dahil nakita mo ang isang treasure chest\n" + "at gusto mo itong buksan ang kaso may Password at nakasulat ganto, " + "Give me 7 numbers that from 1-10 and have result of 69\n" + "OH yeah baby!!!!");
        LineSeparator.lineSeparator();
        num1 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num2 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num3 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num4 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num5 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num6 = Player.readInt("1-10: ", 10);
        System.out.println("*Click Sounds*");
        num7 = Player.readInt("1-10: ", 10);
        int ans = add(num1, num2, num3, num4, num5, num6, num7);
        for (int i = 0; i < 1000; i++) {
            if (ans == 69) {
                System.out.println("PASSWORD MATCH ");
                finished5();
                break;
            } else {
                System.out.println("WRONG PASSWORD ");
                end5();
            }
        }
    }

    static int add (int num1, int num2) {
        return num1 + num2;
    }

    static int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    static int add (int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    static int add (int num1, int num2, int num3, int num4, int num5) {
        return num1 + num2 + num3 + num4 + num5;
    }

    static int add (int num1, int num2, int num3, int num4, int num5, int num6) {
        return num1 + num2 + num3 + num4 + num5 + num6;
    }

    static int add (int num1, int num2, int num3, int num4, int num5, int num6, int num7) {
        return num1 + num2 + num3 + num4 + num5 + num6 + num7;
    }

    @Override
    public void finished () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Masaya kayong kumain ng hotdog ni Aljur nung diwata at bigla syang namatay\n" + "kaya di mo natanong papuntang thailand nagbigti kanalang \n\nThe End.");
        LineSeparator.lineSeparator();
        TorF.lose();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);
        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }
    }

    @Override
    public void finished1 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("Diwata: Masaya ako nakarating ibigay mo saken ang batuta.");
        System.out.println(name + ": Masaya pala ka kwentuhan si mang johny.");
        System.out.println("Diwata: true dating customer ko yun e. akin na batuta ko");
        System.out.println(name + ": Gived*");
        System.out.println("Biglang nilunok ang batuta at nabilaukan \n" + "at namatay. Nagiisa kananaman ng dahil sa depresyon\n" + "naingit ka kaya ginaya mo \n\nThe End.");
        LineSeparator.lineSeparator();
        TorF.lose();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);

        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }
    }

    @Override
    public void finished2 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("At Bigla kang tinuklaw ng malaking sawa. AYUN DEADS \n" + "LESSON LEARNED LAHAT NG MALAKING SAWA MAHILIG SA MASIKIP\n" + "WAG PUMILI NG MASIKIP BAKA MATUKLAW NG SAWA\n\nThe End.");
        LineSeparator.lineSeparator();
        TorF.lose();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);

        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }
    }

    @Override
    public void finished3 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("At ilang araw ka sa kweba bigla kang pumanaw.\n" + "nakita ka ng bata " + "bata: Ay 2nd hand pala nabigay ko sayo \n" + "may covid yung huling gumamit niyan eh sorna\n\n" + "" + "The End.");
        LineSeparator.lineSeparator();
        TorF.lose();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);

        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }

        }

    }

    @Override
    public void finished4 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("At masaya kana meron kang itak\n" + "ang problema mo nga lang naliligaw ikaw sa mapusok na daan\n" + "hindi muna makita nasaan ang buko mo\n" + "at biglang hinablot ka ng OSO sa likod ikaw pa tinaga ng OSO\n" + "madaling salita dedz kana Happy ang hapunan\n\n" + "" + "The End.");
        LineSeparator.lineSeparator();
        TorF.lose();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);

        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }

    }

    @Override
    public void finished5 () {
        System.out.println();
        LineSeparator.lineSeparator();
        System.out.println("PAG BUKAS MO NG ISANG MALAKING TREASURE CHEST \n" + "Nakita mong walang alahas ginto o anumang salapi sa loob ng chest\n" + "Pero may nakita kang lagare at naghinayang. Pero may naisip ka\n" + "naglagare ka ng mga puno ng niyog para gawing bangka\n" + "at sa kalaunan pagkatapos gumawa ng bangka\n" + "dali dali kana umalis ng isla at nakakita ka ng isa pang isla\n" + "at dun ka namalagi nakita ka ng mga taong nandoon \n" + "niligtas ka para makabalik sa iyong tahanan\n" + "\nBINABATI KITA IKAW AY NAGWAGI!!!!!!!!!!!!");
        LineSeparator.lineSeparator();
        TorF.win();
        LineSeparator.lineSeparator();
        System.out.println("1. Back");
        int choices = Player.readInt("=====> ", 1);
        if (choices == 1) {
            if (CharacterStats.isconfirmStats) {
                EditAndDisplayInput.displayAllInput();
            } else {
                EditAndDisplayInput.displayAllInput2();
            }
        }

    }

}
