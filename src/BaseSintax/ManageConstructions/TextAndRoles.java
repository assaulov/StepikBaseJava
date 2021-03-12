package BaseSintax.ManageConstructions;
import static java.lang.System.*;
public class TextAndRoles {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            result.append(roles[i])
                    .append(":")
                    .append("\n");
            for (int j = 0; j <textLines.length ; j++) {
                if(textLines[j].startsWith(roles[i] + ":")) {
                    result.append(j+1)
                            .append(")")
                            .append(textLines[j].substring(roles[i].length()+1))
                            .append("\n");
                }

            }
            result.append("\n");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String [] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
       };
        String [] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить Аммос Федорович: Как ревизор? вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

       out.println(printTextPerRole(roles,textLines));

    }

}
