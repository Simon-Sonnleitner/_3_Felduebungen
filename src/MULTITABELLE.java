public class MULTITABELLE
{
    private int[][] tabelle;

    public MULTITABELLE()
    {
        this.tabelle = new int[10][10];

        /**
         * Wir zählen jede Zeile (Index i) aus.
         */
        for(int i = 0; i < 10; i++)
        {
            /**
             * Wähle für jede Zeile jede Spalte (Index j) aus
             */
            for(int j = 0; j < 10; j++)
            {
                tabelle[i][j] = i * j;
            }
        }
    }

    public void tabelleAusgeben()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(tabelle[i][j] + " ");
            }
            System.out.println();
        }
    }

}
