# mars-weather
Delivers data about Mars Sol's temperatures re-modeling it from the NASA Insight API.

In the project directory, run the project with maven:

### `mvn spring-boot:run`
Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

Endpoints:

**__GET Request: /sols__**
```javascript
[
  {
    "name": "name",
    "average": 0.0
  },
  {
    "name": "name",
    "average": 0.0
  },
  ...
]
```

**__GET Request: /sols/{sol_name}__**
```javascript
{
  "name": "name",
  "average": 0.0,
  "minimum": 0.0,
  "maximum": 0.0
}
```
