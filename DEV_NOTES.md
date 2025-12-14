快速开始

推荐使用 GitHub Codespaces 或 Docker Compose 来运行项目，无需在本机安装数据库。

Docker Compose（在仓库根目录运行，会启动 MySQL 和后端服务）：

```bash
docker compose up --build
```

后端地址： `http://localhost:8080`

GitHub Codespaces：
- 仓库包含 `.devcontainer/devcontainer.json`，打开 Codespace 时会启动一个开发容器（服务名 `workspace`），并在 `postCreateCommand` 中构建后端。