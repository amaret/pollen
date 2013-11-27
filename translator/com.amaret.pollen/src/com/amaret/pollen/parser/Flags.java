package com.amaret.pollen.parser;

public enum Flags {
	BIND, CLASS, COMPOSITION, CONST, CONSTRUCTOR, ENUM, ERR, 
	FIELD, INTRINSIC_VAR, HOST, 
	IS_POSTEXPR, IS_THISPTR, IS_PTR, IS_DECL, IS_TYPEDEF, IS_PEG, // these are for name output (codegen)
	LOG, META, META_ARG, TYPE_META_ARG, 
	METHOD, MODULE, NEW, OUT,
	PEG, PRESET, PROTOCOL, PROTOCOL_MEMBER, PUBLIC,
	VOLATILE, VOID_FCN, VOID_INSTANCE
}
