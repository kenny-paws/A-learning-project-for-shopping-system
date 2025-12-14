# shopping-system
just a simple project for academic learning

## Requirements
- Java 21 (LTS)
- Maven 3.8+

## Quickstart (backend)
Build and run the backend (from repository root):

```bash
# build the backend
mvn -f backend/pom.xml -DskipTests package

# run the backend
mvn -f backend/pom.xml spring-boot:run
```

Or use Docker Compose (starts MySQL + backend):

```bash
docker compose up --build
```

## CI manual run (Actions -> Workflows)

You can run the CI workflow manually from GitHub UI:

- Go to the repository on GitHub -> `Actions` tab
- Select the `CI` workflow
- Click `Run workflow` and choose branch (e.g., `appmod/java-migration-20251214174735`)

This is useful to test the project in Codespaces or to trigger builds on demand.
