const express = require("express");
const next = require("next");
const Router = require("./routes");

const app = next({ dev: process.env.NODE_ENV !== "production" });
const server = express();
const handle = Router.getRequestHandler(app);

const path = require("path");

app.prepare().then(() => {
    server.get("/OneSignalSDKWorker.js", (req, res) => {
        const filePath = path.resolve("./static/OneSignalSDKWorker.js");
        return app.serveStatic(req, res, filePath);
    });
    server.get("/OneSignalSDKUpdaterWorker.js", (req, res) => {
        const filePath = path.resolve("./static/OneSignalSDKUpdaterWorker.js");
        return app.serveStatic(req, res, filePath);
    });
    server.get("*", (req, res) => handle(req, res));
    server.listen(8081);
});
