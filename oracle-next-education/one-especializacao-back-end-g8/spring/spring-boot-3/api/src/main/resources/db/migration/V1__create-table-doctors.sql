CREATE TABLE doctors (
    id BIGSERIAL PRIMARY KEY, -- Alterado de BIGINT AUTO_INCREMENT para BIGSERIAL
    name VARCHAR(255) NOT NULL,
    doctor_number VARCHAR(255) NOT NULL,
    crm VARCHAR(255) NOT NULL UNIQUE,
    specialty VARCHAR(255) NOT NULL,
    street VARCHAR(255),
    complement VARCHAR(255),
    address_number INT,
    neighborhood VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    zip_code VARCHAR(255)
);