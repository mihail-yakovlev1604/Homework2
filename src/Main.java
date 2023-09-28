public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog  / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerX = 78.2;
        var boxerY = 82.7;
        var bokserMass = boxerX + boxerY;
        System.out.println(bokserMass);
        var diffInMass = boxerY - boxerX;
        System.out.println(diffInMass);
        diffInMass = boxerY % boxerX;
        System.out.println(diffInMass);
        var owerHoWork = 640;
        var hoMan = 8;
        var overWorkHo = owerHoWork / hoMan;
        System.out.println("Всего работников в компании"  + overWorkHo +  "человк");
        var workPlus = 94;
        var overWork = overWorkHo + workPlus;
        var result = owerHoWork / overWork;
        System.out.println("Если в компании работает" + overWork + "то всего" + result + "часов работы может быть поделено между сотрудниками");
    }
}

