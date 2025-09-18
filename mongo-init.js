db = db.getSiblingDB("book-store");

db.createUser({
    user: "allan",
    pwd: "allan",
    roles: [
        { role: "readWrite", db: "book-store" }
    ]
});
