-- Geben Sie für alle Flüge die Anschlussflüge aus, die in einem Zeitraum von ein bis zwölf
-- Stunden nach der Landung am Anschlussflughafen verfügbar sind. (Lassen Sie die GMT-
-- Abweichung der Flughäfen unberücksichtigt)

SELECT F1.FLUGID, F1.FLUGNUMMER, F1.FLUGHAFEN_DESTINATION, F1.ABFLUGZEIT, F2.FLUGID,
       F2.FLUGNUMMER, F2.FLUGHAFEN_ABFLUG, F2.ABFLUGZEIT FROM FLUG F1 JOIN FLUG F2 ON F1.FLUGHAFEN_DESTINATION = F2.FLUGHAFEN_ABFLUG
        AND F1.ABFLUGZEIT + INTERVAL '1' HOUR <= F2.ABFLUGZEIT
        AND F1.ABFLUGZEIT + INTERVAL '12' HOUR >= F2.ABFLUGZEIT;