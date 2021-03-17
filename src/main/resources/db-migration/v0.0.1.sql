create table emtabb.model_request
(
	id serial not null
		constraint model_request_pk
			primary key,
	"lastUpdatedBy" text,
	"lastUpdatedDate" timestamp
);