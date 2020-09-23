package com.anupama.assets.controllers;

import com.anupama.assets.models.Members;
import com.anupama.assets.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private PagedResourcesAssembler<Members> pagedResourcesAssembler;
    
    /*@GetMapping("/members")
    public ResponseEntity<PagedModel<Members>> getAllAlbums(Pageable pageable) 
    {
        Page<AlbumEntity> albumEntities = albumRepository.findAll(pageable);
         
        PagedModel<AlbumModel> collModel = pagedResourcesAssembler
                            .toModel(albumEntities, albumModelAssembler);
         
        return new ResponseEntity<>(collModel,HttpStatus.OK);
    }*/
}
