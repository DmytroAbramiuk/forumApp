CREATE TABLE IF NOT EXISTS users (
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE CHECK (LENGTH(username) >= 2),
    password VARCHAR(100) NOT NULL,
    role     VARCHAR(20)  NOT NULL DEFAULT 'USER'
);

CREATE TABLE IF NOT EXISTS posts (
    id              BIGSERIAL PRIMARY KEY,
    title           VARCHAR(20) NOT NULL,
    post_text       VARCHAR(1000) NOT NULL,
    user_id         BIGSERIAL    NOT NULL,
    created_date    TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_date    TIMESTAMP  NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users (id)
);
