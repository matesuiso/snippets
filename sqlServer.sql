-- TRIGGERS
ALTER TRIGGER <triggerName> ON <table> AFTER <INSERT or UPDATE or DELETE> AS
	SET NOCOUNT ON; -- not show the correct execution message

	DECLARE @varColumn1 int;
	DECLARE @varColumn2 int;

	DECLARE cAux CURSOR FOR SELECT Column1, Column2 FROM <inserted or deleted>;
	OPEN cAux
    -- INSERT haven't a 'deleted' table
    -- UPDATE have 'inserted' and 'deleted' tables
    -- DELETE haven't a 'inserted' table
	
	FETCH NEXT FROM cAux INTO @varColumn1, @varColumn2

    IF @@FETCH_STATUS <> 0 PRINT 'Empty'
  
	WHILE (@@FETCH_STATUS = 0)
	BEGIN
	    -- Do Something like this, for each row
        UPDATE <same or anotherTable>
        SET updatedAt = GETDATE() 
            , Column2 = @varColum2 +1
        WHERE Column1 = @varColumn1

        -- Obtain next value
		FETCH NEXT FROM cAux INTO @varColumn1, @varColumn2
	END

    -- Close cursor and free the memory
	CLOSE cAux
	DEALLOCATE cAux
	 
END
