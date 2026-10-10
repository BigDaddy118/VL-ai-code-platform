# VL AI Code Platform

AI 驱动的代码平台（前后端分离）。

## 当前阶段

| 模块 | 状态 | 说明 |
|------|------|------|
| 后端 | ✅ 已初始化 | Spring Boot 骨架就绪，含统一响应、异常处理、健康检查、Knife4j 文档 |
| 前端 | 🚧 初始化中 | Vue 3 + Vite 脚手架已拉起，业务页面与对接尚未开始 |

## 技术栈

**后端**

- Java 21 / Spring Boot 4.1
- MySQL（依赖已引入，尚未接库）
- Hutool / Lombok / Knife4j (OpenAPI)

**前端**（`VL-ai-code-platform-frontend/`）

- Vue 3 / TypeScript / Vite
- Vue Router / Pinia

## 目录结构

```
VL-ai-code-platform/                 # 后端（仓库根目录）
├── src/main/java/.../               # Spring Boot 源码
├── src/main/resources/application.yml
└── VL-ai-code-platform-frontend/    # 前端（初始化中）
```

## 本地启动

### 后端

```bash
./mvnw spring-boot:run
```

- 服务地址：`http://localhost:8123/api`
- 接口文档：`http://localhost:8123/api/doc.html`
- 健康检查：`GET /api/health`

### 前端

```bash
cd VL-ai-code-platform-frontend
npm install
npm run dev
```

## 下一步

1. 完成前端工程初始化与基础布局
2. 前后端联调（CORS 已配置）
3. 接入数据库与业务模块
