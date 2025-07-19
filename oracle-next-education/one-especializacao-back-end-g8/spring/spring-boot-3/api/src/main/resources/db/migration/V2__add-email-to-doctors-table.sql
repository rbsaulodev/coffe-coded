ALTER TABLE doctors
ADD COLUMN email VARCHAR(255) NOT NULL UNIQUE; -- Adicione NOT NULL UNIQUE se o email deve ser obrigatório e único