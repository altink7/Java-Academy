/*-----------------------------------------------
Übung 9.1.1
Geben Sie nur jene Personen (Vorname, Nachname) aus, deren Gehalt über dem Durchschnitt liegt.
Sortieren Sie absteigend nach Gehalt und aufsteigend nach Nachnamen und Vornamen.
-----------------------------------------------*/

SELECT VORNAME, NACHNAME FROM PERSON p
JOIN PERSONAL P2 on p.PERSONID = P2.PERSONID
JOIN GEHALTSSTUFE g on P2.GEHALTSSTUFEID = g.GEHALTSSTUFEID
WHERE MONATSGEHALT >
      (SELECT AVG(MONATSGEHALT) FROM PERSONAL JOIN GEHALTSSTUFE
          ON PERSONAL.GEHALTSSTUFEID = GEHALTSSTUFE.GEHALTSSTUFEID)
ORDER BY VORNAME, NACHNAME;



/*-----------------------------------------------
Übung 9.1.2
Geben Sie eine Liste aller Personen aus (Vorname, Nachname), für die keine Nationalität angegeben ist.
Sortieren Sie aufsteigend nach Nachnamen und Vornamen. (ohne Join)
-----------------------------------------------*/
SELECT VORNAME, NACHNAME FROM PERSON p
WHERE p.PERSONID NOT IN (SELECT PERSONID FROM REISEPASS)
ORDER BY NACHNAME, VORNAME;


-- UION ALL  Beispiel
SELECT VORNAME FROM PERSON p
WHERE p.PERSONID = 1 OR 1 = 1 UNION ALL (SELECT NACHNAME FROM PERSON);



