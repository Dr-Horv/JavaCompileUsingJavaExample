import derp.DepNerp;
import derp.Herp;

public class Main {

    public static void main(String[] args) {

        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));

        Herp h = (Herp) JavaCompilerHelper.compile("package derp;\n" +
                "\n" +
                "public class Herp {\n" +
                "\n" +
                "    public void derp() {\n" +
                "        System.out.println(\"derp\");\n" +
                "    }\n" +
                "}\n");

        h.derp();

        Lerp l = (Lerp) JavaCompilerHelper.compile("/**\n" +
                " * Created by horv on 03/02/16.\n" +
                " */\n" +
                "public class Lerp {\n" +
                "\n" +
                "    public void merp() {\n" +
                "        System.out.println(\"merp\");\n" +
                "    }\n" +
                "}\n");

        l.merp();


        DepNerp dn = (DepNerp) JavaCompilerHelper.compile("package derp;\n" +
                "\n" +
                "import gerp.AbstractVerp;\n" +
                "\n" +
                "/**\n" +
                " * Created by horv on 04/02/16.\n" +
                " */\n" +
                "public class DepNerp extends AbstractVerp {\n" +
                "\n" +
                "    public void zerp() {\n" +
                "        System.out.println(\"zerp\");\n" +
                "    }\n" +
                "}\n");

        dn.zerp();
        dn.oerp();


    }

}
