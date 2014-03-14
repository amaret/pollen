package com.amaret.pollen.parser;

public enum Flags {
	BIND, CLASS, COMPOSITION, CONST, CONSTRUCTOR, ENUM, ERR, 
	FIELD, INTRINSIC_VAR, HOST, HOST_NONCONST,
	IS_POSTEXPR, IS_THISPTR, IS_PTR, IS_DECL, IS_CLASSREF_TYPEDEF,  	// IS_* are for name output (codegen)
	IS_FCNREF_TYPEDEF, IS_FCNARG_TYPEDEF, IS_PEG, IS_FCNPTR_ARR_CALL, 	
	IS_PROTOMBR_CALL, IS_FCNDECL,										
	FCN_REF_RTN, LOG, META, META_ARG, TYPE_META_ARG,  
	METHOD, MODULE, NEW, OUT,
	PEG, PRESET, PROTOCOL, PROTOCOL_MEMBER, PUBLIC,
	VOLATILE, VOID_FCN, VOID_INSTANCE
}
