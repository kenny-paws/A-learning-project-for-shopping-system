后端（Spring Boot）运行说明

本项目提供两种运行方式：本地（需要 Java/Maven）或使用 Docker Compose（包含 MySQL），并支持在 GitHub Codespaces 中使用。

本地运行（需要 Java 17+ & Maven）：

```bash
cd backend
mvn spring-boot:run
```

Docker Compose（在仓库根目录运行，会启动 MySQL 和后端服务）：

```bash
docker compose up --build
```

- 后端地址： `http://localhost:8080`
- MySQL：`localhost:3306`，数据库 `shopping`，用户 `shop`，密码 `shop`

GitHub Codespaces：
- 仓库包含 `.devcontainer/devcontainer.json` 和 `docker-compose.yml`，打开 Codespace 时会启动一个开发容器（服务名 `workspace`），并在 `postCreateCommand` 中构建后端。

How to run in Codespaces / Dev Container
- Open in GitHub Codespaces or VS Code Remote - Containers. The dev container uses Java 21 and will build the backend on create.
- Ports forwarded: `8080` for the app, `3306` for MySQL (if you enable it).
- To run the smoke test inside Codespaces: `cd backend && mvn test -Dtest=ApplicationSmokeTest`.

示例接口：
- `GET /api/products` 列表
- `GET /api/products/{id}` 获取单个
- `POST /api/products` 新增
- `PUT /api/products/{id}` 更新
- `DELETE /api/products/{id}` 删除