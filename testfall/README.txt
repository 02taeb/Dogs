Testklasserna i denna zipfil innehåller grundläggande JUnit-testfall för inlämningsuppgifterna kopplade till föreläsning 6,7 och 8 på PROG1. 

Katalogen common innehåller gemensamma delar som behövs av (nästan) alla test. Innehåller i denna katalog måste packas upp och läggas till i projektet innan du kan använda några av testfallen.

I övrigt finns det en katalog per uppgift som innehåller JUnit-testfallen för uppgiften.

Dessa testfall ingår som en viktig del i de test som körs i VPL vid inlämning, och görs tillgängliga för er för att ni ska kunna se (en del av) de tester som körs och lättare kunna tolka resultaten, men också för att ni ska kunna köra dem i er egen utvecklingsmijö. Det sistnämnda är en MYCKET stark rekommendation, det är så pass mycket enklare att arbeta där att det alltid är det första du ska göra. Det tar några minuter att sätta upp första gången, men det har du igen direkt. Behöver du hjälp med detta finns det material i ilearn, och du kan också höra du av dig till handledningen. 

Testfallen fokuserar på funktionaliteten, och att de huvudsakliga restriktioner som framgår av uppgiftstexten är uppfyllda. De flesta stilfrågor, och andra generella saker, kontrolleras sedan vid inlämning i VPL, liksom mer avancerade scenarier, och kommunikation med användaren.

Anledningen till att testfallen är bortkommenterade från början är för att du ska kunna ladda hem allihopa på en gång utan att få (alltför många) kompileringsfel. Ett tips är att testfallen är uppsatta i en hyfsat logisk ordning. Ta därför och avkommentera dem ett efter ett, så kan du koncentrera dig på en deluppgift i taget.

Testfallen är helt nya för i år, och kommer att uppdateras flera gånger under kursen när vi ser att de inte täcker något intressant. I samband med sådana uppdateringar kommer inlämningarna i VPL att rättas om med de nya testfallen. Det finns alltså en risk att tidigare godkända uppgifter underkänns.

Ändra INTE på testfallen. Det finns naturligtvis en liten chans att eventuella problem är problem med testfallen, men sådant tenderar att upptäckas snabbt, och nya versioner av testfallen läggas upp.

Du får gärna lägga till extra testfall om du vill, men tänk på att dessa kommer att försvinna om du laddar ner en uppdaterad version av testfallen. Det är alltså bättre att lägga sådana extra testfall i en separat klass. Detta är en vanlig java-fil som oftast ser ut något i den här stilen:

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class NamnPåKlassenTest {
   @Test
   public void namnPåFörstaTestet(){
      ... 
	  assertEquals(förväntatVärde, faktisktVärde);
   }
   @Test
   public void namnPåAndraTestet(){
      ... 
	  assertTrue(någotSomBordeVaraSant);
   }
}

Det finns många fler assert-metoder för att kontrollera olika saker, men assertEquals och assertTrue/assertFalse är de primära.