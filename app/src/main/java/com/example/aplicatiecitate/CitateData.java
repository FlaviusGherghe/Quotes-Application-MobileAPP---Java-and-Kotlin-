package com.example.aplicatiecitate;

import java.util.ArrayList;
import java.util.List;

public class CitateData {

    public static List<CitateList> getViataCitate() {

        final List<CitateList> viataCitateList = new ArrayList<>();

        CitateList viataCitat1 = new CitateList("Viata ne obisnuieste cu moartea prin somn. Viata ne avertizeaza ca exista o alta viata prin vis.", "Eliphas Levicioran");
        viataCitateList.add(viataCitat1);

        CitateList viataCitat2 = new CitateList("Urmeaza-ti fericirea si Universul iti va deschide usi acolo unde erau doar ziduri.", "Josep Campbell");
        viataCitateList.add(viataCitat2);

        CitateList viataCitat3 = new CitateList("Nu renunta nicioadata.", "Winston Churchill");
        viataCitateList.add(viataCitat3);

        return viataCitateList;
    }

    public static List<CitateList> getMotivatieCitate() {

        final List<CitateList> motivatieCitateList = new ArrayList<>();

        CitateList motivatieCitat1 = new CitateList("In viata nu exista limite…Cu exceptia celor autoimpuse.", "Les Brown");
        motivatieCitateList.add(motivatieCitat1);

        CitateList motivatieCitat2 = new CitateList("Trebuie sa-ti doresti sa fii puternic. Altfel, nu vei ajunge niciodata asa.", "Friedrich Nietzsche");
        motivatieCitateList.add(motivatieCitat2);

        CitateList motivatieCitat3 = new CitateList("Te-ai nascut cu aripi, de ce preferti sa te tarasti prin viata?", "Rumi");
        motivatieCitateList.add(motivatieCitat3);

        return motivatieCitateList;
    }

    public static List<CitateList> getEnglezaCitate() {

        final List<CitateList> englezaCitateList = new ArrayList<>();

        CitateList englezaCitat1 = new CitateList("There are three choices in this life: be good, get good, or give up.", "David Shore");
        englezaCitateList.add(englezaCitat1);

        CitateList englezaCitat2 = new CitateList("I never was someone who was at ease with happiness.", "Hugh Laurie");
        englezaCitateList.add(englezaCitat2);

        CitateList englezaCitat3 = new CitateList("Be yourself; everyone else is already taken.", "Oscar Wilde");
        englezaCitateList.add(englezaCitat3);

        return englezaCitateList;
    }

    public static List<CitateList> getIubireCitate() {

        final List<CitateList> iubireCitateList = new ArrayList<>();

        CitateList iubireCitat1 = new CitateList("Fericirea se naște din iubire, iar iubirea se naște chiar din inima omului.", "Don Miguel Ruiz");
        iubireCitateList.add(iubireCitat1);

        CitateList iubireCitat2 = new CitateList("Adevărata iubire începe de acolo de unde tu nu mai aștepți nimic în schimb.", "Antoine de Saint-Exupery");
        iubireCitateList.add(iubireCitat2);

        CitateList iubireCitat3 = new CitateList("Să iubim nebunește tot ce strălucește pe acest pământ, fiindcă altă viață nu ne este cunoscută.", "Euripide Rhesus");
        iubireCitateList.add(iubireCitat3);

        return iubireCitateList;
    }

    public static List<CitateList> getSuccesCitate() {

        final List<CitateList> succesCitateList = new ArrayList<>();

        CitateList succesCitat1 = new CitateList("Succesul este atins cel mai adesea de cei care nu stiu ca esecul este inevitabil.", "Coco Channel");
        succesCitateList.add(succesCitat1);

        CitateList succesCitat2 = new CitateList("Toate visele noastre pot deveni realitate daca avem curajul sa le urmam.", "Walt Disney");
        succesCitateList.add(succesCitat2);

        CitateList succesCitat3 = new CitateList("Un om de succes este cel care poate pune o baza solida cu caramizi pe care altii le-au aruncat in el.", "David Brinkley");
        succesCitateList.add(succesCitat3);

        return succesCitateList;
    }


}
