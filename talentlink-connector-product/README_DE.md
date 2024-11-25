# TalentLink Konnektor

[TalentLink](https://developer.lumesse-talenthub.com/) ist eine cloudbasierte Plattform für Recruiting und Talentakquise von Lumesse (jetzt Teil von Cornerstone OnDemand). Sie vereinfacht den Einstellungsprozess, von der Stellenausschreibung bis hin zur Verwaltung, Prüfung und Berichterstellung von Kandidaten. TalentLink hilft Unternehmen, den Talentakquise-Prozess effizient zu verwalten und HR-Prozesse zu automatisieren.

Dieser Konnektor:

- basiert auf REST- und SOAP-Webservice-Technologien.
- bietet Dir Zugriff auf Beispiel-Funktionalitäten von TalentLink.

## Demo

Starte den Testprozess. Er gibt Dir Testdaten im Log zurück.

## Setup

Bevor Interaktionen zwischen der Axon Ivy Engine und den TalentLink-Services ausgeführt werden können, müssen diese miteinander bekannt gemacht werden. Dies kann folgendermaßen erfolgen:

1. Besorge Dir einen TalentLink-Account mit `host-name`, `user-name`, `password` und `api_key`.

2. Überschreibe die Variablen für `host-name`, `user-name`, `password` und `api_key` im Demo-Projekt, wie im folgenden Beispiel gezeigt:

```
Variablen:
  
  talentlink-connector:
  
    host: <myhost>
    
    username: <myuser>
  
    # [password]
    password: <mypass>
    
    apikey: <myapikey>
```
