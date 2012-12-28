#include <stddef.h>

/* common prologue */

typedef char            bool;
typedef char            byte;
typedef const char*     string;
typedef void            Void;
typedef void*           voidPtr;

/* FOR TESTING assume gcc.avr target contribution */
#ifndef pollen__target_name 
#define pollen__target_name pollen.target.gcc.avr
#endif

#define pollen__target_hdr <pollen__target_name/std.h>
#include pollen__target_hdr


/* common epilogue */

typedef struct __ArrDesc__ {
    voidPtr elems;
    uint16 length;
} __ArrDesc__;

#define __arrDescSet__(buf,arr,Type) ((buf.elems = arr), (buf.length = sizeof (arr) / sizeof Type), buf)

#undef true
#define true 1

#undef false
#define false 0

#undef null
#define null 0

#ifndef pollen__const_decl
#define pollen__const_decl(var) \

#endif

void __done();
void __fail();
void __halt();
void __run();
