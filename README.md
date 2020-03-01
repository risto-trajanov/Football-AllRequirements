# Football-AllRequirements

Да се напише програма која ќе моделира резултати од фудбалски натпревари во една лига. Програмата треба да ги покажува резултатите на сите натпревари што се играле во моменталното коло во една лига (слично како на livescore.com), дополнително треба да напише дали натпреварот е завршен или не.
Пример:
Manchester United 10:0 Chelsea - finished
Arsenal 0:3 Liverpool - ongoing
Everton 3:3 Tottenham - finished
Newcastle 3:3 Stoke City - ongoing
West Ham 1:3 Southampton - finished
West Bromwich 2:1 Leichester - ongoing
Едно коло од лигата се сочинува од:
- Листа од натпревари
Еден натпревар се сочинува од:
- Домашен тим
- Гостински тим
- Резултат (голови домашни, голови гости)
- Дали натпреварот е завршен или не
Еден тим се сочинува од:
- Име
- Листа од играчи
Проширување
1) Да се прошири програмата така што, кај натпреварите што се завршени, името на тимот кој што победил да се напише со големи букви. Ако натпреварот е нерешен, имињата на двата тима остануваат не променети.

Пример:

      MANCHESTER UNITED 10:0 Chelsea - finished 

      Arsenal 0:3 Liverpool - ongoing 

      Everton 3:3 Tottenham - finished 

      Newcastle 3:3 Stoke City - ongoing 

      West Ham 1:3 SOUTHAMPTON - finished 

      West Bromwich 2:1 Leichester - ongoing
2) Да се прошири програмата така што за натпреварите дополнително ќе се чува информација кои играчи дале голови за двата тима посебно и на која позиција играат. Ако некој тим на натпреварот не дал гол, не се печати ништо за кој постигнал гол

Пример:


      MANCHESTER UNITED 3:0 Chelsea - finished

      Home Scorers: Igrach 1 (AMF), Igrach 1 (AMF), Igrach 1 (AMF)

      Arsenal 0:3 Liverpool - ongoing

      Away Scorers: Igrach 2 (CF), Igrach 3 (LM), Igrach 4 (CF)

      Everton 3:3 Tottenham - finished

      Home Scorers: Igrach 5 (CM), Igrach 6 (RW), Igrach 5 (CM)

      Away Scorers: Igrach 7 (CM), Igrach 7 (CM), Igrach 7 (CM)

      Newcastle 3:3 Stoke City - ongoing

      Home Scorers: Igrach 8 (CM), Igrach 8 (CM), Igrach 8 (CM)

      Away Scorers: Igrach 9 (CM), Igrach 9 (CM), Igrach 9 (CM)

      West Ham 3:4 SOUTHAMPTON - finished

      Home Scorers: Igrach 10 (AMF), Igrach 12 (LMF), Igrach 13 (RMF)

      Away Scorers: Igrach 11 (RWF), Igrach 11 (RWF), Igrach 11 (RWF), Igrach 14 (RWF)

3) Да се прошири програмата така што кога таа ќе започне ќе го праша корисникот дали сака да ги оддели натпреварите што се завршени и да ги испечати прво нив, па потоа натпреварите што не се завршени. Кориникот треба да внесе валидна boolean вредност (true/false) и програмата не смее да го пушти корисникот да продолжи додека точната вредност не е внесена. Ако внесе true, тогаш програмата треба да го направи поделувањето, ако внесе false, тогаш програмата треба да се однесува идентично, односно да ги испечати натпреварите редоследно.
Do you want the matches sorted by finished? true/false
        false

        MANCHESTER UNITED 3:0 Chelsea - finished

        Home Scorers: Igrach 1 (AMF), Igrach 1 (AMF), Igrach 1 (AMF)

        Arsenal 0:3 Liverpool - ongoing

        Away Scorers: Igrach 2 (CF), Igrach 3 (LM), Igrach 4 (CF)

        Everton 3:3 Tottenham - finished

        Home Scorers: Igrach 5 (CM), Igrach 6 (RW), Igrach 5 (CM)

        Away Scorers: Igrach 7 (CM), Igrach 7 (CM), Igrach 7 (CM)

        Newcastle 3:3 Stoke City - ongoing

        Home Scorers: Igrach 8 (CM), Igrach 8 (CM), Igrach 8 (CM)

        Away Scorers: Igrach 9 (CM), Igrach 9 (CM), Igrach 9 (CM)

        West Ham 3:4 SOUTHAMPTON - finished

        Home Scorers: Igrach 10 (AMF), Igrach 12 (LMF), Igrach 13 (RMF)

        Away Scorers: Igrach 11 (RWF), Igrach 11 (RWF), Igrach 11 (RWF), Igrach 14 (RWF)

        West Bromwich 0:0 Leichester - ongoing

        Do you want the matches sorted by finished? true/false

        true

        finished matches:

        MANCHESTER UNITED 3:0 Chelsea - finished

        Home Scorers: Igrach 1 (AMF), Igrach 1 (AMF), Igrach 1 (AMF)

        Everton 3:3 Tottenham - finished

        Home Scorers: Igrach 5 (CM), Igrach 6 (RW), Igrach 5 (CM)

        Away Scorers: Igrach 7 (CM), Igrach 7 (CM), Igrach 7 (CM)

        West Ham 3:4 SOUTHAMPTON - finished

        Home Scorers: Igrach 10 (AMF), Igrach 12 (LMF), Igrach 13 (RMF)

        Away Scorers: Igrach 11 (RWF), Igrach 11 (RWF), Igrach 11 (RWF), Igrach 14 (RWF)

        ------------------------------

        ongoing matches:

        Arsenal 0:3 Liverpool - ongoing

        Away Scorers: Igrach 2 (CF), Igrach 3 (LM), Igrach 4 (CF)

        Newcastle 3:3 Stoke City - ongoing

        Home Scorers: Igrach 8 (CM), Igrach 8 (CM), Igrach 8 (CM)

        Away Scorers: Igrach 9 (CM), Igrach 9 (CM), Igrach 9 (CM)

        West Bromwich 0:0 Leichester - ongoing

4) Да се измени програмата така што резултатот ќе се пресметува според тоа колку играчи дале гол за тимот. Кога ќе се додаде играч во листата со играчи кои дале гол за домашниот тим, тогаш резултатот за домашниот тим се зголемува. Истото важи и за гостинскиот тим.

