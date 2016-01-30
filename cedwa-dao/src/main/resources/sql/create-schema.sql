--ALTER TABLE "position" DROP CONSTRAINT fk_position_to_sponsor;
DROP TABLE "user";

-- Table: "user"
CREATE TABLE "user"
(
  id bigint,
  guid character(36),
  name character varying(50),
  password character varying(100),
  last_login timestamp with time zone,
  is_locked boolean
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "user"
  ADD CONSTRAINT pk_user PRIMARY KEY (id);
ALTER TABLE "user"
  OWNER TO dcsaunvpyrdqsv;

CREATE SEQUENCE public.hibernate_sequence;

-- Foreign Keys
CREATE UNIQUE INDEX idx_user_guid
   ON "user" (guid ASC NULLS LAST);
